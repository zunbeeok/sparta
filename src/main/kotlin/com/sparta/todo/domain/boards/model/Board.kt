package com.sparta.todo.domain.boards.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import java.time.ZonedDateTime


@Entity
//@Table(name = "board")
class Board(
    @Column(name = "title")
    var title:String,

    @Column(name = "text")
    var text:String,

    @Column(name = "member_id")
    var author :String,


) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long? = null

    @CreationTimestamp
    @Column(name="created_at", updatable = false)
    var createdAt: ZonedDateTime = ZonedDateTime.now();

}