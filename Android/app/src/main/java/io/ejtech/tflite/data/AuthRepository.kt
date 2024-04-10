package io.ejtech.tflite.data

import com.google.firebase.auth.AuthResult
import io.ejtech.tflite.ui.detection.Resource
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun loginUser(email: String, password: String): Flow<Resource<AuthResult>>
    fun registerUser(email: String, password: String): Flow<Resource<AuthResult>>
    fun resetPassword(email: String)
}