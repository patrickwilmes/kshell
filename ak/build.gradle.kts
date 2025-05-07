plugins {
    id("buildsrc.convention.kotlin-jvm")
    alias(libs.plugins.kotlinPluginSerialization)
}

dependencies {
    implementation(libs.bundles.kotlinxEcosystem)
    implementation(platform(buildsrc.convention.Dependencies.ArrowStack))
    implementation(buildsrc.convention.Dependencies.ArrowCore)
    implementation(buildsrc.convention.Dependencies.ArrowCoroutines)
    implementation(buildsrc.convention.Dependencies.KotlinXCoroutines)
    testImplementation(kotlin("test"))
}
