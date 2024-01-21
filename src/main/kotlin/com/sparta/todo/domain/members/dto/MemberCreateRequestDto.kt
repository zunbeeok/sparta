package com.sparta.todo.domain.members.dto

data class MemberCreateRequestDto(
    val email:String,
    val password : String,
    val name:String
)