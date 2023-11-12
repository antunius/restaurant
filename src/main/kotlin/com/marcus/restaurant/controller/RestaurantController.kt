package com.marcus.restaurant.controller

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.core.io.ClassPathResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("restaurant")
@RestController
class RestaurantController {

    @GetMapping
    fun hello(): String {
        return "Hello world"
    }

    @PostMapping("/order")
    fun receiveOrder(@RequestBody order: Order): Welcome? {
        val resource = ClassPathResource("static/response.json").inputStream
        val objectMapper = jacksonObjectMapper()
        return objectMapper.readValue(resource, Welcome::class.java)
    }
}