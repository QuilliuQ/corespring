package ru.sylas.corespring.service

import ru.sylas.corespring.entities.TestEntity
import ru.sylas.corespring.repository.TestRepo

class TestService: AbstractService<TestEntity, TestRepo>() {
    override fun getAll(): List<TestEntity> {
        TODO("Not yet implemented")
    }
}