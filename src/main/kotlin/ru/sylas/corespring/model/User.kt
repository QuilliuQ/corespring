package ru.sylas.corespring.model

import ru.sylas.corespring.common.sha256
import ru.sylas.corespring.common.Mapper
import ru.sylas.corespring.entities.UserEntity

data class User(val email:String,val password:String): Mapper<UserEntity> {
    override fun map() =
        UserEntity(
            email = email,
            secret = password.sha256()
        )
}