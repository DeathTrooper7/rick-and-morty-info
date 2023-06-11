plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.deathtrooper7.rickandmorty_presentation"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // Modules
    implementation(project(":rickandmortyinfo-domain"))

    // DI Hilt
    implementation("com.google.dagger:hilt-android:2.45")
    annotationProcessor("com.google.dagger:hilt-android-compiler:2.45")

    // Test
    testImplementation("io.mockk:mockk:1.13.5")
}
