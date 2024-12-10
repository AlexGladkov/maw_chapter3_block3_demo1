plugins {
    `java-platform`
    `maven-publish`
}

group = "tech.mobiledeveloper"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    constraints {
        api("com.arkivanov.decompose:decompose:2.0.0")
        api("com.arkivanov.decompose:router:2.0.0")
    }
}

publishing {
    publications {
        create<MavenPublication>("bom") {
            from(components["javaPlatform"])

            groupId = "com.arkivanov.decompose"
            artifactId = "decompose-bom"
            version = "2024-12-10"
        }
    }
}

