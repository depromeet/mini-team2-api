package com.depromeet.mini.team2.api.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.depromeet.mini.team2.api.dto.BoardDTO;
import com.depromeet.mini.team2.api.mapper.BoardMapper;
import com.depromeet.mini.team2.api.model.Board;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper boardMapper;
	@Autowired
	private StorageService storageService;
	
	@Override
	public BoardDTO getBoard(int boardId) {
		return Optional.ofNullable(boardMapper.findOne(boardId))
				.map(Board::toBoardDTO)
				.orElse(null);
	}
	
	@Override
	public List<BoardDTO> getBoards() {
		return Optional.ofNullable(boardMapper.findAll())
				.orElse(Collections.emptyList())
				.stream()
				.map(Board::toBoardDTO)
				.collect(Collectors.toList());
	}
	
	@Override
	@Transactional
	public int createBoard(BoardDTO boardDTO, MultipartFile multipartFile) {
		Board board = boardDTO.toBoard();
		board.setImage("http://13.125.232.55:8080/files/" + storageService.store(multipartFile));
		return boardMapper.createBoard(board); 
	}
}
