plugins {
    kotlin("jvm") version "2.0.20"
    id("org.jetbrains.dokka") version "1.9.20"
}

group = "fr.hamtec"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    dokkaPlugin("org.jetbrains.dokka:android-documentation-plugin:1.9.20")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}