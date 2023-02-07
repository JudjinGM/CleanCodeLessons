package com.example.cleancodeusecase.domain.usecase

import com.example.cleancodeusecase.domain.models.UserName

class GetUserNameUseCase {

    fun execute() :UserName {
        return UserName(firstName = "Tom", lastName = "Sawyer")
    }
}