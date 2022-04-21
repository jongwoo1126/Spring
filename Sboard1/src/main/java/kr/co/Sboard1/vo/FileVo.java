package kr.co.Sboard1.vo;

import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FileVo {
	
	@Id
	private int fid; 
	private int parent; 
	private String oName; 
	private String nName; 
	private int download;
	private String rdate; 
}
