package com.shuma.kotlin.model

import java.io.Serializable

class User : Serializable {

    var id: Int? = null

    private var userName: String? = null

    private var password: String? = null

    private var phone: String? = null

    constructor(id: Int?, userName: String, password: String, phone: String) {
        this.id = id
        this.userName = userName
        this.password = password
        this.phone = phone
    }

    constructor() : super() {}

    fun getUserName(): String? {
        return userName
    }

    fun setUserName(userName: String?) {
        this.userName = userName?.trim { it <= ' ' }
    }

    fun getPassword(): String? {
        return password
    }

    fun setPassword(password: String?) {
        this.password = password?.trim { it <= ' ' }
    }

    fun getPhone(): String? {
        return phone
    }

    fun setPhone(phone: String?) {
        this.phone = phone?.trim { it <= ' ' }
    }
}