package com.pse.kotlinked.api.rest

import com.pse.kotlinked.api.rest.model.FilmResponseDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/demo/v1")
interface DemoResourceApi {
    @GetMapping("/{id}")
    fun getFilm(@PathVariable("id") id: String): FilmResponseDto
}