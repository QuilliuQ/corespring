package ru.sylas.corespring.entities

import ru.sylas.corespring.model.User
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "User", schema = "public", catalog = "studymob")
@Entity
class UserEntity(

    @Column(name = "email", nullable = false)
    val email:String?=null,
    @Column(name = "secret", nullable = false)
    val secret: String?= null
): UUIDEntity<User>(){
    override fun map() =
        User(
            email = email!!,
            password = secret!!
        )
}