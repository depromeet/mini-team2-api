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
	private String openedAt;
	private String closedAt;
	private String phone;
	private String nearestExit;
	
	@Override
	public String toString() {
		return String.format("{id=%d,boardId=%s,title=%s,content=%s,latitude=%s,longitude=%s,createdAt=%s,openedAt=%s,closedAt=%s,phone=%s,nearestExit=%s}",
				id, boardId, title, content, latitude, longitude, createdAt.toString(),
				openedAt, closedAt, phone, nearestExit);
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
				.openedAt(openedAt)
				.closedAt(closedAt)
				.phone(phone)
				.nearestExit(nearestExit)
				.build();
	}
}
