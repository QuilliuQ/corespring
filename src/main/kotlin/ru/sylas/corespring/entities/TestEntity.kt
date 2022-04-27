package ru.sylas.corespring.entities

import ru.sylas.corespring.model.Test
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "User", schema = "public", catalog = "studymob")
@Entity
class TestEntity(

    @Column(name = "email", nullable = false)
    val email:String?=null,
    @Column(name = "secret", nullable = false)
    val secret: String?= null
): UUIDEntity<Test>(){
    override fun map() =
        Test(
            email = email!!,
            password = secret!!
        )
}