package com.depromeet.mini.team2.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.depromeet.mini.team2.api.model.Post;

@Mapper
public interface PostMapper {
	int createPost(@Param("post") Post post);
}
