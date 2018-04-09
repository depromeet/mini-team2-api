package com.depromeet.mini.team2.api.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.depromeet.mini.team2.api.dto.BoardDTO;
import com.depromeet.mini.team2.api.mapper.BoardMapper;
import com.depromeet.mini.team2.api.model.Board;

@Service
public class BoardServiceImpl implements BoardService {
	private Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	@Autowired
	private BoardMapper boardMapper;
	
	public BoardDTO getBoard(int boardId) {
//		Board board = boardMapper.findOne(boardId);
//		BoardDTO boardDTO = board.toBoardDTO();
		return Optional.ofNullable(boardMapper.findOne(boardId))
				.map(Board::toBoardDTO)
				.orElse(null);
	}
	
	public List<BoardDTO> getBoards() {
		List<Board> boards = boardMapper.findAll();
		if (Objects.isNull(boards) || CollectionUtils.isEmpty(boards))
			return Collections.emptyList();
		logger.debug(String.valueOf(boards.size()));
		logger.debug(boards.get(0).toString());
		
		List<BoardDTO> boardDTOs = new ArrayList<>();
		for (Board board : boards) {
			logger.debug(board.toString());
			boardDTOs.add(board.toBoardDTO());
		}		
		return boardDTOs;
	}
}
