package com.depromeet.mini.team2.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardDTO {
	private int id;
	private String name;
	
	@Override
	public String toString() {
		return String.format("id=%d, name=%s", id, name);
	}
}
