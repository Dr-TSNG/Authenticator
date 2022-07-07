plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.aurora.authenticator"
        minSdk = 21
        targetSdk = 33
        versionCode = 3
        versionName = "1.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    //Kotlin
    implementation("androidx.core:core-ktx:1.8.0")

    //Google Material
    implementation("com.google.android.material:material:1.6.1")

    //Fuel - HTTP Client
    implementation("com.github.kittinunf.fuel:fuel:2.3.0")

    //Kovenant - For easy async tasks
    implementation("nl.komponents.kovenant:kovenant:3.3.0")
    implementation("nl.komponents.kovenant:kovenant-android:3.3.0")
}
