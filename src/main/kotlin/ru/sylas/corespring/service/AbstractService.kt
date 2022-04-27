package ru.sylas.corespring.service

import ru.sylas.corespring.entities.Entity
import ru.sylas.corespring.repository.Repository

abstract class AbstractService<E:Entity,R:Repository>(private val repository:R) :CommonService<E>{

}