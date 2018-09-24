package com.shuma.kotlin.controller

import com.shuma.kotlin.model.User
import com.shuma.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @Autowired
    lateinit var userService :UserService

    @GetMapping("/test")
    fun test():String{
        return "hello kotlin web!"
    }

    @GetMapping("/user")
    fun user():List<User>{
        return userService.getList()
    }
}