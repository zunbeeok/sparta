package com.sparta.todo.domain.boards.controller


import com.sparta.todo.domain.boards.dto.CreateBoardRequest
import com.sparta.todo.domain.boards.dto.BoardResponse
import com.sparta.todo.domain.boards.dto.UpdateBoardRequest
import com.sparta.todo.domain.boards.service.BoardService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/todo")
class BoardController(
    private val boardService: BoardService,
) {


    @GetMapping("/{todoId}")
    fun getBoard(@PathVariable todoId:Long):ResponseEntity<BoardResponse>{
        return ResponseEntity.status(HttpStatus.OK).body(boardService.getBoardById(todoId));
    }

    @GetMapping()
    fun getBoards(): ResponseEntity<List<BoardResponse>> {
        return ResponseEntity.status(HttpStatus.OK).body(boardService.getBoardList());
    }

    @PostMapping()
    fun createdBoard(@RequestBody createBoardRequest: CreateBoardRequest ):ResponseEntity<BoardResponse>{
        return ResponseEntity.status(HttpStatus.CREATED).body(boardService.createBoard(createBoardRequest));
    }

    @PutMapping("/{todoId}")
    fun updateBoard(@PathVariable todoId: Long, @RequestBody updateBoardRequest: UpdateBoardRequest):ResponseEntity<BoardResponse>{
        return ResponseEntity.status(HttpStatus.OK).body(boardService.updateBoard(todoId,updateBoardRequest));
    }

    @DeleteMapping("/{todoId}")
    fun deleteBoard(){
        TODO()
    }

}