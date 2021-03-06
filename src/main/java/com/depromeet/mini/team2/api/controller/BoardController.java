package com.depromeet.mini.team2.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.depromeet.mini.team2.api.dto.BoardDTO;
import com.depromeet.mini.team2.api.service.BoardService;

@RestController
@RequestMapping(value = "/api")
public class BoardController {
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/boards", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public String createBoard(@ModelAttribute BoardDTO boardDTO, @RequestParam("file") MultipartFile file) throws Exception {
		if (boardService.createBoard(boardDTO, file) == 0) {
			// TODO:
			// - custom exception
			// - exception handler, controller advice
			throw new Exception("Failed to create a board.");
		}
		return "";
	}

	@RequestMapping(value = "/boards/{boardId}", method = RequestMethod.GET)
	public BoardDTO getBoard(@PathVariable int boardId) {
		BoardDTO baordDTO = boardService.getBoard(boardId);
		
		return baordDTO;
	}

	@RequestMapping(value = "/boards", method = RequestMethod.GET)
	public List<BoardDTO> getBoards() {
		
		
		return boardService.getBoards();
	}
}
