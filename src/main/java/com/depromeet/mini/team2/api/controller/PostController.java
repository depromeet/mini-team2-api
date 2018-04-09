package com.depromeet.mini.team2.api.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.depromeet.mini.team2.api.dto.PostDTO;
import com.depromeet.mini.team2.api.service.PostService;


@RestController
public class PostController {
	@Autowired
	private PostService postService;

	@RequestMapping(value = "/api/boards/{boardId}/posts", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public String createPost(@RequestBody PostDTO postDTO, @PathVariable int boardId) throws Exception {
		if (postService.createPost(postDTO, boardId) == 0) {
			throw new Exception("Failed to create a post.");
		}
		return "";
	}

	@RequestMapping(value = "/api/boards/{boardId}/posts", method = RequestMethod.GET)
	public List<String> getPosts(@PathVariable int boardId) {

		return Collections.emptyList();
	}
	
	
	@RequestMapping(value = "/api/boards/{boardId}/posts/{postId}", method = RequestMethod.GET)
	public String getPost(@PathVariable int boardId, @PathVariable int postId) {
		
		return "";
	}

}
