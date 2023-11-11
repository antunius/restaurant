package com.marcus.restaurant.controller

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
    fun receiveOrder(@RequestBody order: Order): String {
        return "Received ${order.id}"
    }
}