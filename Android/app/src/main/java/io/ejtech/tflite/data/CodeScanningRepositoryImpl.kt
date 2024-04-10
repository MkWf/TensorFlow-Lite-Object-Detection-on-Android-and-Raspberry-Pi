package io.ejtech.tflite.data

import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.codescanner.GmsBarcodeScanner
import io.ejtech.tflite.ui.detection.Resource
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class CodeScanningRepositoryImpl @Inject constructor(
    private val scanner: GmsBarcodeScanner
): CodeScanningRepository {
    override fun scanQRCode(): Flow<Resource<String>> {
        return callbackFlow {
            scanner.startScan()
                .addOnSuccessListener { barcode ->
                    launch {
                        send(getQRCodeDetails(barcode))
                    }
                }
                .addOnFailureListener {
                    Resource.Error<String>("Couldn't read QR Code")
                }

            awaitClose {}
        }
    }

    override fun scanVIN(): Flow<Resource<String>> {
        return callbackFlow {
            scanner.startScan()
                .addOnSuccessListener { barcode ->
                    launch {
                        send(getVINBarCodeDetails(barcode))
                    }
                }
                .addOnFailureListener {
                    Resource.Error<String>("Couldn't read VIN")
                }

            awaitClose {}
        }
    }

    private fun getQRCodeDetails(barcode: Barcode): Resource<String> {
        when (barcode.valueType) {
            Barcode.TYPE_TEXT -> {
                barcode.rawValue?.let {
                    if (it.contains("VocollServerInfo=")) {
                        return Resource.Success(barcode.rawValue!!)
                    }
                }
            }
        }
        return Resource.Error("Couldn't read QR Code")
    }

    private fun getVINBarCodeDetails(barcode: Barcode): Resource<String> {
        when (barcode.valueType) {
            Barcode.TYPE_TEXT -> {
                barcode.displayValue?.let {
                    if (it.length >= 17) {
                        //Get the last 17
                        val length = it.length
                        val startIndex = length - 17
                        val vin = it.substring(startIndex, length)
                        return Resource.Success(vin)
                    }
                }
            }
        }
        return Resource.Error("Couldn't read VIN")
    }
}