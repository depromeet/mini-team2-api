package com.depromeet.mini.team2.api.service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.depromeet.mini.team2.api.dto.PostDTO;
import com.depromeet.mini.team2.api.mapper.BoardMapper;
import com.depromeet.mini.team2.api.mapper.PostMapper;
import com.depromeet.mini.team2.api.model.Post;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private BoardMapper boardMapper;
	
	@Transactional
	@Override
	public int createPost(PostDTO postDTO, int boardId) throws Exception {
		if (Objects.isNull(boardMapper.findOne(boardId))) {
			throw new Exception("Board does not exist.");
		}
		postDTO.setBoardId(boardId);
		return postMapper.createPost(postDTO.toPost());
	}
	
	@Override
	public List<PostDTO> getPostsByBoardId(int boardId) {
		return Optional.ofNullable(postMapper.findPostsByBoardId(boardId))
				.orElse(Collections.emptyList())
				.stream()
				.map(Post::toPostDTO)
				.collect(Collectors.toList());
	}
	
	@Override
	public PostDTO getPost(int postId) {
		return Optional.ofNullable(postMapper.findOne(postId))
				.map(Post::toPostDTO)
				.orElse(null);
	}
}
