plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
}

group = "fr.hamtec.chapitre2_3"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
subprojects {
    apply(plugin = "org.jetbrains.dokka")
}