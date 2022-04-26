package ru.sylas.corespring.entities

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class IntEntity<T>: BaseEntity<Int,T>() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override val id: Int? =null
}