package com.marcus.restaurant.controller

import Response
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
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
    fun receiveOrder(@RequestBody order: Order) = Response.get()
}