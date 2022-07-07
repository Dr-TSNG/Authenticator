buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.1")
        classpath(kotlin("gradle-plugin", version = "1.7.0"))
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
