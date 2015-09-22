package com.teiklr.api.card.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teiklr.api.card.domain.Article;
import com.teiklr.api.card.domain.Comment;
import com.teiklr.api.card.service.ArticleService;
import com.teiklr.api.core.util.Page;

@RestController
@RequestMapping(value="/v1.0")
public class ArticleController {
		
	@Autowired
	private ArticleService<Article> articleService;
		
	@RequestMapping(value="/", method=RequestMethod.GET)
	public Page<Article> getAllArticle(@RequestParam(value="offset", required=false, defaultValue="0") int offset, @RequestParam(value="size", required=false, defaultValue="10") int size) throws SQLException {
		return articleService.getArticle(offset, size);
	}
	
	@RequestMapping(value="/category/{type}", method=RequestMethod.GET)
	public Page<Article> getCategoryArticle(@PathVariable("type") String type, @RequestParam(value="offset", required=false, defaultValue="0") int offset, @RequestParam(value="size", required=false, defaultValue="10") int size) {
		return articleService.getArticle(type, offset, size);
	}
	
	@RequestMapping(value="/article/{id}", method=RequestMethod.GET)
	public Article getArticleDetail(@PathVariable("id") int id) throws SQLException {
		return articleService.getArticle(id);
	}
	
	@RequestMapping(value="/article/{id}/comment", method=RequestMethod.GET)
	public Page<Comment> getArticleComment(@PathVariable("id") int id, @RequestParam(value="offset", required=false, defaultValue="0") int offset, @RequestParam(value="size", required=false, defaultValue="10") int size) throws SQLException {
		return articleService.getArticleComment(id, offset, size);
	}
	
}	