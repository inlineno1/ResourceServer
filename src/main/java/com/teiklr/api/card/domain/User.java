package com.teiklr.api.card.domain;
  
public class User {
	
	private String userId;
	private String userTypeCode;
	private String userName;
	private String pictureUrl;
	private String email;
	private String bio;
	public String getUserId() {
		return userId;
	}
	public String getUserTypeCode() {
		return userTypeCode;
	}
	public String getUserName() {
		return userName;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public String getEmail() {
		return email;
	}
	public String getBio() {
		return bio;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserTypeCode(String userTypeCode) {
		this.userTypeCode = userTypeCode;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}	
}
