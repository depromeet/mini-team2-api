package com.depromeet.mini.team2.api.dto;

import java.time.LocalDateTime;

import com.depromeet.mini.team2.api.model.Post;

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
public class PostDTO {
	private int id;
	private int boardId;
	private String title;
	private String content;
	private String latitude;
	private String longitude;
	private LocalDateTime createdAt;
	
	@Override
	public String toString() {
		return String.format("{id=%d,boardId=%s,title=%s,content=%s,latitude=%s,longitude=%s,createdAt=%s}",
				id, boardId, title, content, latitude, longitude, createdAt.toString());
	}
	
	public Post toPost() {
		return Post.builder()
				.postId(id)
				.boardId(boardId)
				.title(title)
				.content(content)
				.latitude(latitude)
				.longitude(longitude)
				.createdAt(createdAt)
				.build();
	}
}
