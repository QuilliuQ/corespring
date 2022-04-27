package ru.sylas.corespring.entities

import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.Type
import ru.sylas.corespring.common.Mapper
import java.util.*
import javax.persistence.*

@MappedSuperclass
abstract class UUIDEntity<T>: BaseEntity<UUID>(),Mapper<T> {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @ColumnDefault(value = "uuid_generate_v4()")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type = "pg-uuid")
    override val id: UUID? =null
}