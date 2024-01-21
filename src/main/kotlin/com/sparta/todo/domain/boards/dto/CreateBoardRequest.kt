package com.sparta.todo.domain.boards.dto

import java.util.Date

data class CreateBoardRequest (
    val title : String,
    val text : String,
    val userId: String,
    val createdAt:Date
)