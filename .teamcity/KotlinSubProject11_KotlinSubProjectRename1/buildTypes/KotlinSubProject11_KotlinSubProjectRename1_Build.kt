package KotlinSubProject11_KotlinSubProjectRename1.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinSubProject11_KotlinSubProjectRename1_Build : BuildType({
    uuid = "43728d4b-efbe-4a17-bd73-037c155c1a30"
    name = "Build"

    vcs {
        root(KotlinSubProject11_KotlinSubProjectRename1.vcsRoots.KotlinSubProject11_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster)
    }

    triggers {
        vcs {
        }
    }
})
