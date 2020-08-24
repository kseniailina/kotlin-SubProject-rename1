package KotlinSubProject1_KotlinSubProjectRename1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster : GitVcsRoot({
    uuid = "98d663d9-9e74-4e67-8458-c4cfb8a12e3d"
    name = "https://github.com/kseniailina/kotlin-SubProject-rename1.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-SubProject-rename1.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:29a36eda-5eec-4d23-bba8-3e6e5efa792f"
    }
})
