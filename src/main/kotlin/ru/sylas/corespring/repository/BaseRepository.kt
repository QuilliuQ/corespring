package ru.sylas.corespring.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import ru.sylas.corespring.entities.Entity
import java.util.*
import javax.swing.JPanel

@NoRepositoryBean
sealed interface BaseRepository<T:java.io.Serializable,E:Entity>:JpaRepository<E,T>,Repository{
    interface BaseIntRepository<E:Entity>:BaseRepository<Int,E>
    interface BaseUUIDRepository<E:Entity>:BaseRepository<UUID,E>
}