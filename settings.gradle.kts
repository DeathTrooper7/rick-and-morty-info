pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Rick and Morty Info"
include(":app")
include(
    ":rickandmortyinfo-data",
    ":rickandmortyinfo-domain",
    ":rickandmortyinfo-presentation"
)
