package com.depromeet.mini.team2.api.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

	@RequestMapping(value = "/api/boards", method = RequestMethod.POST)
	public String createBoard() {
		
		
		return "hi";
	}

	@RequestMapping(value = "/api/boards/{boardId}", method = RequestMethod.GET)
	public List<String> getBoards(@PathVariable int boardId) {
		
		
		return Collections.emptyList();
	}

}
