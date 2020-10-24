package com.kobbikobb.restapi.repos

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers


@SpringBootTest
@AutoConfigureMockMvc
class ReposControllerTest {
    @Autowired
    private val mvc: MockMvc? = null

    @Test
    fun shouldGetRepos() {
            mvc!!.perform(MockMvcRequestBuilders.get("/repos")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("[0].name")
                    .value("My First Repo"))
                .andExpect(MockMvcResultMatchers.jsonPath("[1].name")
                    .value("My Second Repo"))
        }
}