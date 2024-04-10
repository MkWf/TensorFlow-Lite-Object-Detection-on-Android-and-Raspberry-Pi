package io.ejtech.tflite.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

class ServerConnectionInfoDataStore(private val context: Context) {
    val Context.datastore: DataStore<Preferences> by preferencesDataStore(name = "settings")
    private val IP_PREF = stringPreferencesKey("IP_PREF")
    private val PORT_PREF = intPreferencesKey("PORT_PREF")

    suspend fun setIP(ip: String) {
        context.datastore.edit {
            it[IP_PREF] = ip
        }
    }

    suspend fun setPort(port: Int) {
        context.datastore.edit {
            it[PORT_PREF] = port
        }
    }

    fun getIP(): Flow<String> {
        return context.datastore.data
            .catch { exception ->
                if (exception is IOException) {
                    emit(emptyPreferences())
                } else {
                    throw exception
                }
            }
            .map { preference ->
                val ip = preference[IP_PREF] ?: ""
                ip
            }
    }

    fun getPort(): Flow<Int> {
        return context.datastore.data
            .catch { exception ->
                if (exception is IOException) {
                    emit(emptyPreferences())
                } else {
                    throw exception
                }
            }
            .map { preference ->
                val port = preference[PORT_PREF] ?: 0
                port
            }
    }
}
