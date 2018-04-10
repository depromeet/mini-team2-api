package com.depromeet.mini.team2.api.dto;

import com.depromeet.mini.team2.api.model.Board;

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
public class BoardDTO {
	private int id;
	private String name;
	private int subwayId;
	private String image;
	
	@Override
	public String toString() {
		return String.format("{id=%d,name=%s,subwayId=%d,image=%s}", id, name, subwayId, image);
	}
	
	public Board toBoard() {
		return Board.builder()
				.boardId(id)
				.boardName(name)
				.build();
	}
}
