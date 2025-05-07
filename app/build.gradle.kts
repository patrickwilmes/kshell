plugins {
    id("buildsrc.convention.kotlin-jvm")
    application
}

dependencies {
    implementation(project(":ak"))
}

application {
    mainClass = "com.bitlake.app.AppKt"
}
