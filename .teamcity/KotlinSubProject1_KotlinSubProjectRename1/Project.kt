package KotlinSubProject1_KotlinSubProjectRename1

import KotlinSubProject1_KotlinSubProjectRename1.buildTypes.*
import KotlinSubProject1_KotlinSubProjectRename1.vcsRoots.*
import KotlinSubProject1_KotlinSubProjectRename1.vcsRoots.KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

const val REPOSITORY_NAME = "gmat2-thirdparty-swx-qt-build"

object Project : Project({
    uuid = "693f05f0-1bc4-4a65-b417-5c7ca3d77663"
    id("KotlinSubProject1_KotlinSubProjectRename1")
    parentId("KotlinSubProject1")
    name = REPOSITORY_NAME

    vcsRoot(KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster)

    buildType(KotlinSubProject1_KotlinSubProjectRename1_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_10"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
