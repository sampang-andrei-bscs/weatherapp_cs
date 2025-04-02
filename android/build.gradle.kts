buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1") // Use your current version
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20") // Match your Kotlin version
        classpath("dev.flutter:flutter-gradle-plugin:2.9.0") // Or your Flutter version
    }
}