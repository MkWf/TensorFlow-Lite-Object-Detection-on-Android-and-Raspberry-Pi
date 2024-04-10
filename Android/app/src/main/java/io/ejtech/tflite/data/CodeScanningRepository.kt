package io.ejtech.tflite.data

import io.ejtech.tflite.ui.detection.Resource
import kotlinx.coroutines.flow.Flow

interface CodeScanningRepository {
    fun scanQRCode(): Flow<Resource<String>>
    fun scanVIN(): Flow<Resource<String>>

}