package com.sparta.todo.domain.boards.dto

data class UpdateBoardRequest(
    val title:String,
    val userId:String,
    val text:String
)