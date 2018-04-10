package com.depromeet.mini.team2.api.model;

import com.depromeet.mini.team2.api.dto.SubwayDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Subway {
	private int subwayId;
	private String subwayName;
	
	public SubwayDTO toSubwayDTO() {
		SubwayDTO subwayDTO = new SubwayDTO();
		subwayDTO.setId(subwayId);
		subwayDTO.setName(subwayName);
		return subwayDTO;
	}

	@Override
	public String toString() {
		return String.format("subwayId=%d, subwayName=%s", subwayId,subwayName);
	}
}
