package kr.co.Sboard1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.Sboard1.dao.ArticleDao;
import kr.co.Sboard1.persistence.ArticleRepo;
import kr.co.Sboard1.vo.ArticleVo;

@Service
public class ArticleService {

	@Autowired
	private ArticleDao dao;
	
	@Autowired
	private ArticleRepo repo;
	
	public void insertArticle(ArticleVo vo) {}
	public ArticleVo selectArticle(int no) {
		return null;
	}
	public List<ArticleVo> selectArticles(){
		return null;
	}
	public void updateArticle(ArticleVo vo) {}
	public void deleteArticle(int no) {}
}
