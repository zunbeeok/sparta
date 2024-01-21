package com.sparta.todo.domain.boards.dto

import com.sparta.todo.domain.boards.model.Board

data class BoardResponse (
        val id: Long?,
        val title:String,
        val text:String,
        val userId:String,
        val createdAt:String,
    ){

    companion object{
        fun from(board: Board):BoardResponse{
            return BoardResponse(
                id = board.id,
                title = board.title,
                text = board.text,
                userId = board.userId,
                createdAt = board.createdAt.toString()

            )
        }
    }
}