package ru.sylas.corespring.model

import ru.sylas.corespring.common.sha256
import ru.sylas.corespring.common.Mapper
import ru.sylas.corespring.entities.TestEntity

data class Test(val email:String, val password:String): Mapper<TestEntity> {
    override fun map() =
        TestEntity(
            email = email,
            secret = password.sha256()
        )
}