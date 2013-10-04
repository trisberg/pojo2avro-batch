package com.springdeveloper.domain;

/**
 */
public class Tweet {

	Long id;
	Long createdAt;
	String fromUser;
	String text;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	public String getFromUser() {
		return fromUser;
	}

	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
