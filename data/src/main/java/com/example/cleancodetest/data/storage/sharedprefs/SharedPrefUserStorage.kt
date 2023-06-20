package com.example.cleancodetest.data.storage.sharedprefs

import android.content.Context
import com.example.cleancodetest.data.storage.UserStorage
import com.example.cleancodetest.data.storage.models.User


private const val SHARED_PREFS_NAME ="shared_prefs_name"
private const val KEY_FIRST_NAME ="firstName"
private const val KEY_LAST_NAME ="lastName"
private const val DEFAULT_LAST_NAME ="Default last name"
private const val DEFAULT_FIRST_NAME ="Default first name"


class SharedPrefUserStorage(context: Context): UserStorage {
    private val sharedPreference = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun save(user: User): Boolean {
        sharedPreference.edit().putString(KEY_FIRST_NAME, user.firstName).apply()
        sharedPreference.edit().putString(KEY_LAST_NAME, user.lastName).apply()
        return true
    }


    override fun get(): User {
        val firstName = sharedPreference.getString(KEY_FIRST_NAME, DEFAULT_FIRST_NAME) ?: DEFAULT_FIRST_NAME
        val lastName = sharedPreference.getString(KEY_LAST_NAME, DEFAULT_LAST_NAME) ?: DEFAULT_LAST_NAME

        return User(firstName = firstName, lastName = lastName)    }
}
