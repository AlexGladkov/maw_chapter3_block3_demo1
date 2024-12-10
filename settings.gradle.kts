enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "MAWC3B3D1"

include(
    "app",
    "decompose-bom"
)

