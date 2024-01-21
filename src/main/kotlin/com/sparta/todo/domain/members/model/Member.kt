package com.sparta.todo.domain.members.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "member")
class Member(
    @Column(name = "email")
    var email: String,

    @Column(name = "password")
    var password:String,

    @Column(name = "name")
    var name:String

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? =null;

}