plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.ksp)
    alias(libs.plugins.hilt.android)
    id("kotlin-parcelize")
}

android {
    namespace = "com.duft.newso"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.duft.newso"
        minSdk = 31
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
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
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
    implementation("androidx.core:core-splashscreen:1.0.1")
    implementation("androidx.navigation:navigation-compose:2.6.0")
    // Hilt
    val hilt_version = "2.51.1" // Use a recent version of Hilt
    implementation("com.google.dagger:hilt-android:$hilt_version")
    ksp("com.google.dagger:hilt-compiler:$hilt_version") // Changed from kapt to ksp
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0") // Also update this



    // Retrofit
    val retrofit_version = "2.9.0"
    implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofit_version")

    //Coil
    implementation("io.coil-kt:coil-compose:2.4.0")

    //Datastore
    implementation ("androidx.datastore:datastore-preferences:1.0.0")

    //Compose Foundation
    implementation ("androidx.compose.foundation:foundation:1.4.3")

    //Accompanist
    implementation ("com.google.accompanist:accompanist-systemuicontroller:0.31.4-beta")

    //Paging 3
    implementation ("androidx.paging:paging-runtime:3.1.1")
    implementation ("androidx.paging:paging-compose:3.2.0-rc01")

    // Room
    val room_version = "2.6.1" // Define the latest stable version once
    implementation("androidx.room:room-runtime:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    ksp("androidx.room:room-compiler:$room_version") // Use ksp instead of kapt






}