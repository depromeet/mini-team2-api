package com.depromeet.mini.team2.api.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depromeet.mini.team2.api.dto.BoardDTO;
import com.depromeet.mini.team2.api.mapper.BoardMapper;
import com.depromeet.mini.team2.api.model.Board;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	public BoardDTO getBoard(int boardId) {
		return Optional.ofNullable(boardMapper.findOne(boardId))
				.map(Board::toBoardDTO)
				.orElse(null);
	}
	
	public List<BoardDTO> getBoards() {
		return Optional.ofNullable(boardMapper.findAll())
				.orElse(Collections.emptyList())
				.stream()
				.map(Board::toBoardDTO)
				.collect(Collectors.toList());
	}
	
	public int createBoard(BoardDTO boardDTO) {
		return boardMapper.createBoard(boardDTO.toBoard()); 
	}
}
