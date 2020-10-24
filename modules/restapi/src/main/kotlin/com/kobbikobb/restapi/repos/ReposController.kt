package com.kobbikobb.restapi.repos

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(path = ["/repos"])
@ResponseBody
class ReposController {

    @GetMapping
    fun getRepos(): List<RepoBean> {
        return listOf(
            RepoBean(UUID.randomUUID(), "My First Repo", "http://www.first.com"),
            RepoBean(UUID.randomUUID(), "My Second Repo", "http:www.second.com")
        )
    }

}
