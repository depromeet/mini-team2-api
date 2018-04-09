package com.depromeet.mini.team2.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.depromeet.mini.team2.api.model.Board;

@Mapper
public interface BoardMapper {
	Board findOne(@Param("boardId") int boardId);
	List<Board> findAll();
}
