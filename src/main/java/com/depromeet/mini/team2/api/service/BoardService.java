package com.depromeet.mini.team2.api.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.depromeet.mini.team2.api.dto.BoardDTO;

public interface BoardService {
	BoardDTO getBoard(int boardId);
	List<BoardDTO> getBoards();
	int createBoard(BoardDTO boardDTO, MultipartFile multipartFile);
}
