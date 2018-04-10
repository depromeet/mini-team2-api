package com.depromeet.mini.team2.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.depromeet.mini.team2.api.model.Post;

@Mapper
public interface PostMapper {
	int createPost(@Param("post") Post post);
	List<Post> findPostsByBoardId(@Param("boardId") int boardid);
	Post findOne(@Param("postId") int postId);
}
