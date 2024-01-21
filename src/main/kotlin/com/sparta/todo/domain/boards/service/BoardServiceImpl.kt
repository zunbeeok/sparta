package com.sparta.todo.domain.boards.service

import com.sparta.todo.domain.boards.dto.BoardResponse
import com.sparta.todo.domain.boards.dto.CreateBoardRequest
import com.sparta.todo.domain.boards.dto.UpdateBoardRequest
import com.sparta.todo.domain.boards.model.Board
import com.sparta.todo.domain.boards.repository.BoardRepository
import jakarta.transaction.Transactional
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class BoardServiceImpl (
    private val boardRepository: BoardRepository
):BoardService{
    override fun getBoardList(): List<BoardResponse> {
        return boardRepository.findAll().map {
            BoardResponse.from(it)
        };
    }

    override fun getBoardById(boardId: Long): BoardResponse {
        boardRepository.findByIdOrNull(boardId).let {
            it ?: throw Exception()
            return BoardResponse.from(it);
        }

    }

    @Transactional
    override fun createBoard(request: CreateBoardRequest): BoardResponse {
        Board(request.title, request.text , request.userId).let {
            return BoardResponse.from(it);
        }
    }

    @Transactional
    override fun updateBoard(boardId: Long, request: UpdateBoardRequest): BoardResponse {
        return boardRepository.findByIdOrNull(boardId).let {
            it ?: throw Exception()
        }.let {
            it.title = request.title;
            it.text = request.text;

            boardRepository.save(it);
        }.let {
            BoardResponse.from(it);
        }
    }

    @Transactional
    override fun deleteBoard(boardId: Long) {
        return boardRepository.findByIdOrNull(boardId).let {
            it ?: throw Exception();
        }.let {
            boardRepository.delete(it);
        }
    }
}