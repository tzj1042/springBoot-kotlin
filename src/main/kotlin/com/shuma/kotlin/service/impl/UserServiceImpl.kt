package com.shuma.kotlin.service.impl

import com.shuma.kotlin.mapper.UserMapper
import com.shuma.kotlin.model.User
import com.shuma.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService{

    @Autowired
    lateinit var userMapper : UserMapper

    override fun getList(): List<User> {
        return userMapper.getList()
    }

}