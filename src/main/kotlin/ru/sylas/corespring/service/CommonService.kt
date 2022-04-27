package ru.sylas.corespring.service

import ru.sylas.corespring.entities.Entity

interface CommonService<E:Entity> {
    fun getAll():List<E>;
}