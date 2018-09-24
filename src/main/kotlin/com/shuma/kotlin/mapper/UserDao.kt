package com.shuma.kotlin.mapper

import com.shuma.kotlin.model.User

interface UserMapper {
     fun getList(): List<User>
}