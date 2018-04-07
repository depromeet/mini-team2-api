package com.depromeet.mini.team2.api.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {

	@RequestMapping(value = "/api/boards/{boardId}/posts", method = RequestMethod.POST)
	public String createPost(@PathVariable int boardId) {

		return "";

	}

	@RequestMapping(value = "/api/boards/{boardId}/posts", method = RequestMethod.GET)
	public List<String> getPosts(@PathVariable int boardId) {

		return Collections.emptyList();
	}
	
	
	@RequestMapping(value = "/api/boards/{boardId}/posts/{postId}", method = RequestMethod.GET)
	public String getPost(@PathVariable int boardId,@PathVariable int postId) {
		
		return "";
	}

}
