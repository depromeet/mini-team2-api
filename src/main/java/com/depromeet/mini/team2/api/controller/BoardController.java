package com.depromeet.mini.team2.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.depromeet.mini.team2.api.dto.BoardDTO;
import com.depromeet.mini.team2.api.service.BoardService;

@RestController
public class BoardController {
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/api/boards", method = RequestMethod.POST)
	public String createBoard() {
		
		
		return "hi";
	}

	@RequestMapping(value = "/api/boards/{boardId}", method = RequestMethod.GET)
	public BoardDTO getBoard(@PathVariable int boardId) {
		BoardDTO baordDTO = boardService.getBoard(boardId);
		
		return baordDTO;
	}

	@RequestMapping(value = "/api/boards", method = RequestMethod.GET)
	public List<BoardDTO> getBoards() {
		
		
		return boardService.getBoards();
	}
}
