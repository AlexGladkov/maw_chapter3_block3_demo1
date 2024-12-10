plugins {
    kotlin("jvm") version "2.0.0"
}

group = "tech.mobiledeveloper"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(platform("com.arkivanov.decompose:decompose-bom:2024-12-10"))
    implementation("com.arkivanov.decompose:decompose")
    implementation("com.arkivanov.decompose:router")
}