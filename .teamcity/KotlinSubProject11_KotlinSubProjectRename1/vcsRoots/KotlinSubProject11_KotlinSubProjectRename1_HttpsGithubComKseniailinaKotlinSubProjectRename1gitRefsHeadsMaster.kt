package KotlinSubProject11_KotlinSubProjectRename1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinSubProject11_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster : GitVcsRoot({
    uuid = "92ed0ef5-76bd-4321-9249-635e23d11d09"
    name = "https://github.com/kseniailina/kotlin-SubProject-rename1.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-SubProject-rename1.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:29a36eda-5eec-4d23-bba8-3e6e5efa792f"
    }
})
