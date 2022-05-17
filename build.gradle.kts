buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
    }
}

allprojects {
    group = "app.bitprivacy.core"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}