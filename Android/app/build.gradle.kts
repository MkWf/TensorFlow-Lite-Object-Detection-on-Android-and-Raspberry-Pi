plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.hiltAndroid)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    implementation(libs.hilt.android)
    implementation(libs.hilt.navigation.compose)

    ksp(libs.dagger.compiler)
    ksp(libs.hilt.android.compiler)
    //ksp(libs.android.hilt.compiler)
    //ksp("com.google.dagger:dagger-compiler:2.48.1")
    //ksp("com.google.dagger:hilt-android-compiler:2.48.1")


    implementation(libs.androidx.camera)
    implementation(libs.androidx.camera.lifecycle)
    implementation(libs.androidx.camera.view)

    implementation(libs.android.lifecycle.viewmodel.ktx)
    implementation(libs.android.lifecycle.runtime.ktx)
    implementation(libs.android.lifecycle.runtime.compose)
    implementation(libs.android.lifecycle.lifecycle.viewmodel.compose)

    implementation(libs.kotlin.coroutines.core)
    implementation(libs.kotlin.coroutines.android)

    implementation(libs.tflite.task.vision)
    implementation(libs.tflite.gpu)

    //SpeechConverter
    implementation("org.apache.commons:commons-text:1.10.0")

    // WebView
    implementation("com.google.accompanist:accompanist-webview:0.31.1-alpha")

    //System UI bars
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.31.2-alpha")

    // CameraX dependencies
    implementation("androidx.camera:camera-camera2:1.3.0-alpha07")
    implementation("androidx.camera:camera-lifecycle:1.3.0-alpha07")
    implementation("androidx.camera:camera-view:1.3.0-alpha07")

    // Coil
    implementation ("io.coil-kt:coil-compose:1.3.2")

    // Zxing
    implementation ("com.google.zxing:core:3.3.3")

    // Scanner
    implementation ("com.google.android.gms:play-services-code-scanner:16.0.0")
    implementation ("com.google.android.gms:play-services-base:18.2.0")
    implementation ("com.google.mlkit:barcode-scanning:17.1.0")

    // Firebase
    implementation ("com.google.firebase:firebase-auth-ktx:22.0.0")
    implementation(platform("com.google.firebase:firebase-bom:32.2.3"))
    implementation("com.google.firebase:firebase-database-ktx")

    // DataStore
    implementation ("androidx.datastore:datastore-preferences:1.0.0")

    // Google in-app update
    implementation ("com.google.android.play:app-update:2.0.1")
    implementation ("com.google.android.play:app-update-ktx:2.0.1")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}