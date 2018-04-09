package com.depromeet.mini.team2.api.model;

import com.depromeet.mini.team2.api.dto.BoardDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
	private int boardId;
	private String boardName;
	
	public BoardDTO toBoardDTO() {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setId(boardId);
		boardDTO.setName(boardName);
		return boardDTO;
	}
	
	@Override
	public String toString() {
		return String.format("boardId=%d, boardName=%s", boardId, boardName);
	}
}
