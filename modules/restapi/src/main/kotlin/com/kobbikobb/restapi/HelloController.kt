package com.kobbikobb.restapi

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @RequestMapping("/")
    fun index(): String {
        return "Welcome to git analyzer APIs"
    }
}