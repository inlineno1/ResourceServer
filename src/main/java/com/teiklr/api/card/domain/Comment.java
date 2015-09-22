package com.teiklr.api.card.domain;

import java.sql.Date;
 
public class Comment {

	private int commentId;
	private int articleId;
	private String userId;
	private String userName;
	private String pictureUrl;
	private String content;
	private Date createDate;
	private String createId;
	private String createIp;
	private Date updateDate;
	private String updateId;
	private String updateIp;
	private String deleteYn;
	
	public int getCommentId() {
		return commentId;
	}
	public int getArticleId() {
		return articleId;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public String getContent() {
		return content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public String getCreateId() {
		return createId;
	}
	public String getCreateIp() {
		return createIp;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public String getUpdateId() {
		return updateId;
	}
	public String getUpdateIp() {
		return updateIp;
	}
	public String getDeleteYn() {
		return deleteYn;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	public void setUpdateIp(String updateIp) {
		this.updateIp = updateIp;
	}
	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
}