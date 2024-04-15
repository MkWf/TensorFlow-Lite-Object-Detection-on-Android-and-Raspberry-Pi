package io.ejtech.tflite

import android.graphics.PixelFormat
import android.os.Bundle
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import io.ejtech.tflite.ui.detection.DetectionViewModel
import io.ejtech.tflite.ui.theme.MyApplicationTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private var yolov8Ncnn = Yolov8Ncnn()
    private val facing = 1
    val REQUEST_CAMERA = 100
    private val current_model = 0
    private val current_cpugpu = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        yolov8Ncnn.loadModel(this.assets, 0,0)
        keepScreenOn()
        setContent {
            MyApplicationTheme {
                //How DetectionScreen is displayed
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //val detectionViewModel = hiltViewModel<DetectionViewModel>()
                    AndroidView(factory = { context ->
                        SurfaceView(context).apply {
                            holder.setFormat(PixelFormat.RGBA_8888)
                            holder.addCallback(object : SurfaceHolder.Callback {
                                override fun surfaceCreated(holder: SurfaceHolder) {
                                    yolov8Ncnn.setOutputWindow(holder.surface)
                                }

                                override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
                                    //yolov8Ncnn.setOutputWindow(holder.surface)
                                }

                                override fun surfaceDestroyed(holder: SurfaceHolder) {
                                    // Surface is destroyed, clean up resources
                                }
                            })
                        }
                    })
                    /*
                    DetectionScreen(
                        detectionViewModel = detectionViewModel,
                        detectionState = detectionViewModel.detectionState.value
                    )*/
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        yolov8Ncnn.openCamera(facing)
    }

    /**
     * Prevents screen from sleeping
     */
    private fun keepScreenOn() {
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }
}