package kr.co.Sboard1.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Board_article")
public class ArticleVo {
	
	@Id
	private int no;
	private int parent;
	private int commet;
	private String type;
	private String title;
	private String content;
	private int file;
	private int hit;
	private String uid;
	private String regip;
	private String rdate;
}
