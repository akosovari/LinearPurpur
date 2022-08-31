pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "linearpurpur"

include("linearpurpur-api", "linearpurpur-server")
