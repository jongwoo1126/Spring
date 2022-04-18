package kr.co.Sboard1.vo;

import javax.persistence.Id;

import lombok.Data;

@Data
public class TermsVo {

	@Id
	private String terms;
	private String privacy;
}
