package com.sparta.todo.domain.boards.repository

import com.sparta.todo.domain.boards.model.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository :JpaRepository<Board,Long>{
}