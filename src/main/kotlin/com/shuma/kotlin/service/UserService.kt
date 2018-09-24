package com.shuma.kotlin.service
import com.shuma.kotlin.model.User

interface UserService {
    fun getList(): List<User>

}