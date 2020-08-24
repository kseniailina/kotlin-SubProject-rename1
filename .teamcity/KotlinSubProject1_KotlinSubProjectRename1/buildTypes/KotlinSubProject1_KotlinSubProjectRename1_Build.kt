package KotlinSubProject1_KotlinSubProjectRename1.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinSubProject1_KotlinSubProjectRename1_Build : BuildType({
    uuid = "cb1ad54b-767a-48a1-b3fc-a1a5fc75992d"
    name = "Build"

    vcs {
        root(KotlinSubProject1_KotlinSubProjectRename1.vcsRoots.KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster)
    }

    steps {
        script {
            scriptContent = "echo hello"
        }
    }

    triggers {
        vcs {
        }
    }
})
