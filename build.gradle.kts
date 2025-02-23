plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = "dev.syncended.dnsc"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlin.coroutines.core)

    implementation(libs.koin.core)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}