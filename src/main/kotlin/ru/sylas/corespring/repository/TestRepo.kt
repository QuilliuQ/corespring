package ru.sylas.corespring.repository

import org.springframework.stereotype.Repository
import ru.sylas.corespring.entities.TestEntity

@Repository
interface TestRepo :BaseRepository.BaseIntRepository<TestEntity> {
}