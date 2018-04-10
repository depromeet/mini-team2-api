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
	private int subwayId;
	private String image;
	
	public BoardDTO toBoardDTO() {
		return BoardDTO.builder()
				.id(boardId)
				.name(boardName)
				.subwayId(subwayId)
				.image(image)
				.build();
	}
	
	@Override
	public String toString() {
		return String.format("{boardId=%d,boardName=%s,subwayId=%d,image=%s}",
				boardId, boardName, subwayId, image);
	}
}
