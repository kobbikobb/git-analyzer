package com.kobbikobb.restapi.repos

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import java.net.URL

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerIT {
    @LocalServerPort
    private val port = 0
    private var base: URL? = null

    @Autowired
    private val template: TestRestTemplate? = null

    @BeforeEach
    @Throws(Exception::class)
    fun setUp() {
        base = URL("http://localhost:$port/repos")
    }

    @Test
    fun shouldGetRepos() {
            val response = template!!.getForEntity(
                base.toString(),
                String::class.java
            )
            Assertions.assertThat(response.body).isNotEmpty()
        }
}