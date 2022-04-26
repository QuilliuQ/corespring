package ru.sylas.corespring.entities

import ru.sylas.corespring.common.Mapper
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity<T:java.io.Serializable,M>:EntityId<T>, Mapper<M> {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (this.javaClass != other?.javaClass) return false
        other as BaseEntity<*, *>

        if (id != other.id) return false

        return true
    }

    override fun hashCode() = 25

    override fun toString(): String {
        return "${this.javaClass.simpleName}(id=$id)"
    }
}