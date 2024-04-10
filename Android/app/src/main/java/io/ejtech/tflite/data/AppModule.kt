package io.ejtech.tflite.data

import android.app.Application
import android.content.Context
import com.google.android.gms.common.moduleinstall.ModuleInstall
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest
import com.google.firebase.auth.FirebaseAuth
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.codescanner.GmsBarcodeScanner
import com.google.mlkit.vision.codescanner.GmsBarcodeScannerOptions
import com.google.mlkit.vision.codescanner.GmsBarcodeScanning
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ejtech.tflite.data.AuthRepository
import io.ejtech.tflite.data.AuthRepositoryImpl
import io.ejtech.tflite.ui.detection.ObjectDetectorHelper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideFirebaseAuth() = FirebaseAuth.getInstance()

    @Provides
    @Singleton
    fun providesRepositoryImpl(firebaseAuth: FirebaseAuth): AuthRepository {
        return AuthRepositoryImpl(firebaseAuth)
    }

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun provideOptions(): GmsBarcodeScannerOptions {
        return GmsBarcodeScannerOptions.Builder()
            .setBarcodeFormats(Barcode.FORMAT_ALL_FORMATS)
            .build()
    }

    @Provides
    @Singleton
    fun provideScanner(context: Context, options: GmsBarcodeScannerOptions): GmsBarcodeScanner {
        val scanner = GmsBarcodeScanning.getClient(context, options)

        /** Resolves bug where scan can't be performed **/
        val moduleInstallRequest =
            ModuleInstallRequest.newBuilder()
                .addApi(scanner)
                .build()
        val moduleInstallClient = ModuleInstall.getClient(context)
        moduleInstallClient.installModules(moduleInstallRequest)

        return scanner
    }

    @Provides
    @Singleton
    fun provideServerConnInfo(context: Context): ServerConnectionInfoDataStore {
        return ServerConnectionInfoDataStore(context)
    }

    @Provides
    @Singleton
    fun provideLoginInfo(context: Context): LoginInfoDataStore {
        return LoginInfoDataStore(context)
    }

    @Provides
    @Singleton
    fun provideCodeScanningRepository(gmsBarcodeScanner: GmsBarcodeScanner): CodeScanningRepository{
        return CodeScanningRepositoryImpl(gmsBarcodeScanner)
    }

    @Provides
    @Singleton
    fun provideServerRepository(): ServerRepository {
        return ServerRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideObjectDetectorHelper(context: Context): ObjectDetectorHelper {
        return ObjectDetectorHelper(context = context)
    }
}