package KotlinSubProject1_KotlinSubProjectRename1

import KotlinSubProject1_KotlinSubProjectRename1.buildTypes.*
import KotlinSubProject1_KotlinSubProjectRename1.vcsRoots.*
import KotlinSubProject1_KotlinSubProjectRename1.vcsRoots.KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "06c78d4b-8833-4835-93e4-0e2e43938781"
    id("KotlinSubProject1_KotlinSubProjectRename1")
    parentId("KotlinSubProject1")
    name = "Kotlin SubProject Rename1"

    vcsRoot(KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster)

    buildType(KotlinSubProject1_KotlinSubProjectRename1_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_8"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
