package KotlinSubProject11_KotlinSubProjectRename1

import KotlinSubProject11_KotlinSubProjectRename1.buildTypes.*
import KotlinSubProject11_KotlinSubProjectRename1.vcsRoots.*
import KotlinSubProject11_KotlinSubProjectRename1.vcsRoots.KotlinSubProject11_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "4ddd5ecf-164e-4c48-b5d7-447966e9e632"
    id("KotlinSubProject11_KotlinSubProjectRename1")
    parentId("KotlinSubProject11")
    name = "Kotlin SubProject Rename1"

    vcsRoot(KotlinSubProject11_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster)

    buildType(KotlinSubProject11_KotlinSubProjectRename1_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_11"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${KotlinSubProject11_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
