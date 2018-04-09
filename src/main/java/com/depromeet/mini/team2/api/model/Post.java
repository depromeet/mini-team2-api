package com.depromeet.mini.team2.api.model;

import java.time.LocalDateTime;

import com.depromeet.mini.team2.api.dto.PostDTO;

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
public class Post {
	private int postId;
	private int boardId;
	private String title;
	private String content;
	private String latitude;
	private String longitude;
	private LocalDateTime createdAt;
	
	@Override
	public String toString() {
		return String.format("{postId=%d,boardId=%d,title=%s,content=%s,latitude=%s,longitude=%s,createdAt=%s}", 
				postId, boardId, title, content, latitude, longitude, createdAt.toString());
	}
	
	public PostDTO toPostDTO() {
		return PostDTO.builder()
				.id(postId)
				.boardId(boardId)
				.title(title)
				.content(content)
				.latitude(latitude)
				.longitude(longitude)
				.createdAt(createdAt)
				.build();
	}
}
