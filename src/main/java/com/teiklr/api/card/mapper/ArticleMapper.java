package com.teiklr.api.card.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.teiklr.api.card.domain.Article; 
import com.teiklr.api.card.domain.Comment;
import com.teiklr.api.card.domain.User;

public interface ArticleMapper {
 
	public int getArticleCount(@Param("type") String type);

	public List<Article> getArticleList(@Param("type") String type, @Param("offset") int offset, @Param("size") int size);

	public Article getArticle(@Param("type") String type, @Param("articleId") int articleId);	 
	
	public List<Comment> getComment(@Param("articleId") int articleId, @Param("offset") int offset, @Param("size") int size);
	
	public List<Comment> getComment(@Param("type") String type, @Param("articleId") int articleId, @Param("offset") int offset, @Param("size") int size);
	
	public int getCommentCount(@Param("articleId") int articleId);
	
	public int getLikeCount(@Param("articleId") int articleId);
	
	public int getViewCount(@Param("articleId") int articleId);
	
	public User getUser(@Param("userId") String userId);
}