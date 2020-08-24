package KotlinSubProject1_KotlinSubProjectRename1.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinSubProject1_KotlinSubProjectRename1_Build : BuildType({
    uuid = "e5627594-1c2f-42a3-9b99-3662157dca48"
    name = "Build"

    vcs {
        root(KotlinSubProject1_KotlinSubProjectRename1.vcsRoots.KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster)
    }

    steps {
        script {
            scriptContent = """echo "hello""""
        }
    }

    triggers {
        vcs {
        }
    }
})
