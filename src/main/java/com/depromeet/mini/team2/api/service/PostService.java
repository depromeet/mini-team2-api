package com.depromeet.mini.team2.api.service;

import com.depromeet.mini.team2.api.dto.PostDTO;

public interface PostService {
	int createPost(PostDTO postDTO, int boardId) throws Exception;
}
