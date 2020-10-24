package com.kobbikobb.restapi.repos

import java.util.*

data class RepoBean(
    val id: UUID,
    val name: String,
    val url: String
)