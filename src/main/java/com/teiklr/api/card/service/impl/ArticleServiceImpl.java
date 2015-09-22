package com.teiklr.api.card.service.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList; 
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teiklr.api.card.domain.Article;
import com.teiklr.api.card.domain.Comment;
import com.teiklr.api.card.domain.User;
import com.teiklr.api.card.mapper.ArticleMapper;
import com.teiklr.api.card.service.ArticleService;
import com.teiklr.api.core.util.Page;
import com.teiklr.api.core.util.Pagination;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService<Article> {
	
	@Autowired
	private ArticleMapper articleMapper;
	
	@Autowired
	private DataSource dataSource;
			
	private final Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

	@Override
	public Page<Article> getArticle(String type, int offset, int size) {
		int totalCount = articleMapper.getArticleCount(type);
		List<Article> articleList = articleMapper.getArticleList(type, offset, size);
		return new Pagination<Article>(articleList, totalCount, offset, size);
	}

	@Override
	public Page<Article> getArticle(int offset, int size) throws SQLException {
		int totalCount = articleMapper.getArticleCount(null);
		
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT ARTICLE_ID, CATEGORY, TITLE, CONTENT, CONTENT_SUMMARY, IMAGE_SUMMARY_URL, ")
		   .append(" CREATE_DATE, CREATE_ID, CREATE_IP, UPDATE_DATE, UPDATE_ID, UPDATE_IP, PUBLISH_DATE, PUBLISH_ID, PUBLISH_IP, PUBLISH_YN, DELETE_YN ")
		   .append(" FROM ARTICLE ")
		   .append(" WHERE PUBLISH_YN = 'Y' AND DELETE_YN = 'N' ")
		   .append(" LIMIT ?, ? ");
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<Article> articleList = new ArrayList<Article>();
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, offset);
			pstmt.setInt(2, size);
			
			rs = pstmt.executeQuery();

			while (rs.next()) {

				int articleId = rs.getInt(1);
	            String category = rs.getString(2);
	            String title = rs.getString(3);
	            String content = rs.getString(4);
	            String contentSummary = rs.getString(5);
	            String imageSummaryUrl = rs.getString(6);
	            Date createDate = rs.getDate(7);
	            String createId = rs.getString(8);
	            String createIp = rs.getString(9);
	            Date updateDate = rs.getDate(10);
	            String updateId = rs.getString(11);
	            String updateIp = rs.getString(12);
	            Date publishDate = rs.getDate(13);
	            String publishId = rs.getString(14);
	            String publishIp = rs.getString(15);
	            String publishYn = rs.getString(16);
	            String deleteYn = rs.getString(17);
	            
	            User user = articleMapper.getUser(publishId);
	            
	            int commentCount = articleMapper.getCommentCount(articleId);
	            int likeCount = articleMapper.getLikeCount(articleId);
	            int viewCount = articleMapper.getViewCount(articleId);
	            
	            Article article = new Article();
	            article.setArticleId(articleId);
	            article.setCategory(category);
	            article.setTitle(title);
	            article.setContent(content);
	            article.setContentSummary(contentSummary);
	            article.setImageSummaryUrl(imageSummaryUrl);
	            article.setCreateDate(createDate);
	            article.setCreateId(createId);
	            article.setCreateIp(createIp);
	            article.setUpdateDate(updateDate);
	            article.setUpdateId(updateId);
	            article.setUpdateIp(updateIp);
	            article.setPublishDate(publishDate);
	            article.setPublishId(publishId);
	            article.setPublishIp(publishIp);
	            article.setPublishYn(publishYn);
	            article.setDeleteYn(deleteYn);
	            article.setCommentList(null);
	            article.setUser(user);
	            article.setCommentCount(commentCount);
	            article.setLikeCount(likeCount);
	            article.setViewCount(viewCount);
	            
	            articleList.add(article);
	        } 
		} catch (SQLException e) {
			throw e;
		} finally {
			if (rs != null) {rs.close(); rs= null;}
			if (pstmt != null) {pstmt.close(); pstmt = null;}
			if (conn != null) {conn.close(); conn = null;}
		}
		
		
		
		return new Pagination<Article>(articleList, totalCount, offset, size);
	}

	@Override
	public Article getArticle(int id) throws SQLException {
		
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT ARTICLE_ID, CATEGORY, TITLE, CONTENT, CONTENT_SUMMARY, IMAGE_SUMMARY_URL, ")
		   .append(" CREATE_DATE, CREATE_ID, CREATE_IP, UPDATE_DATE, UPDATE_ID, UPDATE_IP, PUBLISH_DATE, PUBLISH_ID, PUBLISH_IP, PUBLISH_YN, DELETE_YN ")
		   .append(" FROM ARTICLE ")
		   .append(" WHERE PUBLISH_YN = 'Y' AND DELETE_YN = 'N' ")
		   .append(" AND ARTICLE_ID = ? ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Article article = new Article();
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();

			while (rs.next()) {

				int articleId = rs.getInt(1);
	            String category = rs.getString(2);
	            String title = rs.getString(3);
	            String content = rs.getString(4);
	            String contentSummary = rs.getString(5);
	            String imageSummaryUrl = rs.getString(6);
	            Date createDate = rs.getDate(7);
	            String createId = rs.getString(8);
	            String createIp = rs.getString(9);
	            Date updateDate = rs.getDate(10);
	            String updateId = rs.getString(11);
	            String updateIp = rs.getString(12);
	            Date publishDate = rs.getDate(13);
	            String publishId = rs.getString(14);
	            String publishIp = rs.getString(15);
	            String publishYn = rs.getString(16);
	            String deleteYn = rs.getString(17);
	            
	            
	            User user = articleMapper.getUser(publishId);
	            
	            int commentCount = articleMapper.getCommentCount(articleId);
	            int likeCount = articleMapper.getLikeCount(articleId);
	            int viewCount = articleMapper.getViewCount(articleId);
	            
	            article.setArticleId(articleId);
	            article.setCategory(category);
	            article.setTitle(title);
	            article.setContent(content);
	            article.setContentSummary(contentSummary);
	            article.setImageSummaryUrl(imageSummaryUrl);
	            article.setCreateDate(createDate);
	            article.setCreateId(createId);
	            article.setCreateIp(createIp);
	            article.setUpdateDate(updateDate);
	            article.setUpdateId(updateId);
	            article.setUpdateIp(updateIp);
	            article.setPublishDate(publishDate);
	            article.setPublishId(publishId);
	            article.setPublishIp(publishIp);
	            article.setPublishYn(publishYn);
	            article.setDeleteYn(deleteYn);
	            article.setCommentList(null);
	            article.setUser(user);
	            article.setCommentCount(commentCount);
	            article.setLikeCount(likeCount);
	            article.setViewCount(viewCount);
	            
	        } 
		} catch (SQLException e) {
			throw e;
		} finally {
			if (rs != null) {rs.close(); rs= null;}
			if (pstmt != null) {pstmt.close(); pstmt = null;}
			if (conn != null) {conn.close(); conn = null;}
		}
		
		return article;
	}
	
	@Override
	public Article getArticle(String type, int id) {
		return articleMapper.getArticle(type, id);
	}
	
	@Override
	public Page<Comment> getArticleComment(int id, int offset, int size) throws SQLException {
		int totalCount = articleMapper.getCommentCount(id);
		List<Comment> commentList = articleMapper.getComment(id, offset, size); 
		return new Pagination<Comment>(commentList, totalCount, offset, size);
	}

	@Override
	public Page<Comment> getArticleComment(String type, int id, int offset, int size) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 
}