package ru.sylas.corespring.entities

interface EntityId<T> :Entity{
    val id:T?
}