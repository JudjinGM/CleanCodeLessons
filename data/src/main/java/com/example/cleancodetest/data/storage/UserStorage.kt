package com.example.cleancodetest.data.storage

import com.example.cleancodetest.data.storage.models.User

interface UserStorage {
    fun save(name: User):Boolean
    fun get(): User
}