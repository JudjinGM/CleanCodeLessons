package com.example.cleancodeusecase.domain.usecase

import com.example.cleancodeusecase.domain.models.SaveUserNameParam

class SaveUserNameUseCase {
    fun execute(param: SaveUserNameParam): Boolean {
        if (param.name.isEmpty()) {
            return false
        } else return true
    }
}