package com.depromeet.mini.team2.api.service;

import java.util.List;

import com.depromeet.mini.team2.api.dto.PostDTO;

public interface PostService {
	int createPost(PostDTO postDTO, int boardId) throws Exception;
	List<PostDTO> getPostsByBoardId(int boardId);
	PostDTO getPost(int postId);
}
