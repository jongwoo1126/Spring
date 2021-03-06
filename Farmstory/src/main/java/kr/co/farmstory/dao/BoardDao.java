package kr.co.farmstory.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import kr.co.farmstory.vo.ArticleVo;
import kr.co.farmstory.vo.FileVo;

@Mapper
@Repository
public interface BoardDao {
	public int insertArticle(ArticleVo vo);
	public void insertFile(FileVo vo);
	public ArticleVo selectArticle(int no);
	public int selectCountTotal(String type);
	public List<ArticleVo> selectArticles(String type, int start);
	public void updateArticle(ArticleVo vo);
	public void deleteArticle(int no);
}