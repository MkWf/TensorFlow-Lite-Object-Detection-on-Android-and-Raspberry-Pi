package io.ejtech.tflite.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

class LoginInfoDataStore(private val context: Context) {
    val Context.datastore: DataStore<Preferences> by preferencesDataStore(name = "loginInfo")
    private val EMAIL = stringPreferencesKey("EMAIL")
    private val PASSWORD = stringPreferencesKey("PASSWORD")

    suspend fun setEmail(email: String) {
        context.datastore.edit {
            it[EMAIL] = email
        }
    }

    suspend fun setPassword(password: String) {
        context.datastore.edit {
            it[PASSWORD] = password
        }
    }

    suspend fun setEmailAndPassword(email: String, password: String){
        context.datastore.edit {
            it[EMAIL] = email
        }
        context.datastore.edit {
            it[PASSWORD] = password
        }
    }

    fun getEmail(): Flow<String> {
        return context.datastore.data
            .catch { exception ->
                if (exception is IOException) {
                    emit(emptyPreferences())
                } else {
                    throw exception
                }
            }
            .map { preference ->
                val email = preference[EMAIL] ?: ""
                email
            }
    }

    fun getPassword(): Flow<String> {
        return context.datastore.data
            .catch { exception ->
                if (exception is IOException) {
                    emit(emptyPreferences())
                } else {
                    throw exception
                }
            }
            .map { preference ->
                val password = preference[PASSWORD] ?: ""
                password
            }
    }
}
