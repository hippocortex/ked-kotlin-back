package com.pse.kotlinked.api.rest

import com.pse.kotlinked.api.rest.model.FilmResponseDto
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoResource : DemoResourceApi {
    private val logger = LoggerFactory.getLogger(DemoResource::class.java)
    override fun getFilm(id: String): FilmResponseDto {
        
        return FilmResponseDto(id = "1", "test")

    }
}