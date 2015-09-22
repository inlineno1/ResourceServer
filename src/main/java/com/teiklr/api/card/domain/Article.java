package com.teiklr.api.card.domain;

import java.sql.Date;
import java.util.List;

public class Article {

	private int articleId;
	private String category;
	private String title;
	private String content;
	private String contentSummary;
	private String imageSummaryUrl;
	private Date createDate;
	private String createId;
	private String createIp;
	private Date updateDate;
	private String updateId;
	private String updateIp;
	private Date publishDate;
	private String publishId;
	private String publishIp;
	private String publishYn;
	private String deleteYn;

	private int commentCount;
	private int viewCount;
	private int likeCount;

	private User user;
	private List<Comment> commentList;
	
	public int getArticleId() {
		return articleId;
	}
	public String getCategory() {
		return category;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getContentSummary() {
		return contentSummary;
	}
	public String getImageSummaryUrl() {
		return imageSummaryUrl;
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
	public Date getPublishDate() {
		return publishDate;
	}
	public String getPublishId() {
		return publishId;
	}
	public String getPublishIp() {
		return publishIp;
	}
	public String getPublishYn() {
		return publishYn;
	}
	public String getDeleteYn() {
		return deleteYn;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public int getViewCount() {
		return viewCount;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public User getUser() {
		return user;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setContentSummary(String contentSummary) {
		this.contentSummary = contentSummary;
	}
	public void setImageSummaryUrl(String imageSummaryUrl) {
		this.imageSummaryUrl = imageSummaryUrl;
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
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public void setPublishId(String publishId) {
		this.publishId = publishId;
	}
	public void setPublishIp(String publishIp) {
		this.publishIp = publishIp;
	}
	public void setPublishYn(String publishYn) {
		this.publishYn = publishYn;
	}
	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
}