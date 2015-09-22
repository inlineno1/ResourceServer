package com.teiklr.api.card.service;

import java.sql.SQLException;

import com.teiklr.api.card.domain.Article;
import com.teiklr.api.card.domain.Comment;
import com.teiklr.api.core.util.Page;


public interface ArticleService<T> {

	public Page<Article> getArticle(String type, int offset, int size);

	public Page<Article> getArticle(int offset, int size) throws SQLException;

	public Article getArticle(String type, int id);	
	
	public Article getArticle(int id) throws SQLException;
	
	public Page<Comment> getArticleComment(String type, int id, int offset, int size) throws SQLException;
	
	public Page<Comment> getArticleComment(int id, int offset, int size) throws SQLException;

}