package io.ejtech.tflite.ui.detection

import ai.onnxruntime.OnnxJavaType
import ai.onnxruntime.OrtSession
import ai.onnxruntime.OnnxTensor
import ai.onnxruntime.OrtEnvironment
import ai.onnxruntime.extensions.OrtxPackage
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.myapplication.R
import java.io.InputStream
import java.nio.ByteBuffer
import java.util.*
import javax.inject.Inject

data class Result(
    var outputBitmap: Bitmap,
    var outputBox: Array<FloatArray>
) {}

class ObjectDetector @Inject constructor(
    private val context: Context
) {
    private var ortEnv: OrtEnvironment = OrtEnvironment.getEnvironment()
    private var ortSession: OrtSession

    init{
        val sessionOptions: OrtSession.SessionOptions = OrtSession.SessionOptions()
        sessionOptions.registerCustomOpLibrary(OrtxPackage.getLibraryPath())
        ortSession = ortEnv.createSession(readModel(), sessionOptions)
    }

    private fun readModel(): ByteArray {
        val modelID = R.raw.yolov8n_with_pre_post_processing
        return context.resources.openRawResource(modelID).readBytes()
    }

    fun detect(inputStream: InputStream): Result {
        var imagestream = context.assets.open("test_object_detection_0.jpg")
        imagestream.reset()
        // Step 1: convert image into byte array (raw image bytes)
        val rawImageBytes = imagestream.readBytes()

        // Step 2: get the shape of the byte array and make ort tensor
        val shape = longArrayOf(rawImageBytes.size.toLong())

        val inputTensor = OnnxTensor.createTensor(
            ortEnv,
            ByteBuffer.wrap(rawImageBytes),
            shape,
            OnnxJavaType.UINT8
        )
        inputTensor.use {
            // Step 3: call ort inferenceSession run
            val output = ortSession.run(Collections.singletonMap("image", inputTensor),
                setOf("image_out","scaled_box_out_next")
            )

            // Step 4: output analysis
            output.use {
                val rawOutput = (output?.get(0)?.value) as ByteArray
                val boxOutput = (output?.get(1)?.value) as Array<FloatArray>
                val outputImageBitmap = byteArrayToBitmap(rawOutput)

                // Step 5: set output result
                var result = Result(outputImageBitmap,boxOutput)
                return result
            }
        }
    }

    private fun byteArrayToBitmap(data: ByteArray): Bitmap {
        return BitmapFactory.decodeByteArray(data, 0, data.size)
    }
}