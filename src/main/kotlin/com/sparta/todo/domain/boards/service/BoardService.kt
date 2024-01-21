package com.sparta.todo.domain.boards.service

import com.sparta.todo.domain.boards.dto.CreateBoardRequest
import com.sparta.todo.domain.boards.dto.BoardResponse
import com.sparta.todo.domain.boards.dto.UpdateBoardRequest

interface BoardService {


    fun getBoardList(): List<BoardResponse>

    fun getBoardById(boardId:Long): BoardResponse

    fun createBoard(request: CreateBoardRequest): BoardResponse

    fun updateBoard(boardId: Long, request: UpdateBoardRequest) :BoardResponse

    fun deleteBoard(boardId: Long)


}