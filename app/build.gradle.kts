plugins {
    id("buildsrc.convention.kotlin-jvm")
    application
}

dependencies {
    implementation(project(":ak"))
    implementation(platform(buildsrc.convention.Dependencies.ArrowStack))
    implementation(buildsrc.convention.Dependencies.ArrowCore)
    implementation(buildsrc.convention.Dependencies.ArrowCoroutines)
    implementation(buildsrc.convention.Dependencies.KotlinXCoroutines)
}

application {
    mainClass = "com.bitlake.kshell.AppKt"
}
