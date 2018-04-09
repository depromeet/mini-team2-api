package com.depromeet.mini.team2.api.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.depromeet.mini.team2.api.dto.PostDTO;
import com.depromeet.mini.team2.api.mapper.BoardMapper;
import com.depromeet.mini.team2.api.mapper.PostMapper;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private BoardMapper boardMapper;
	
	@Transactional
	public int createPost(PostDTO postDTO, int boardId) throws Exception {
		if (Objects.isNull(boardMapper.findOne(boardId))) {
			throw new Exception("Board does not exist.");
		}
		postDTO.setBoardId(boardId);
		return postMapper.createPost(postDTO.toPost());
	}
}
