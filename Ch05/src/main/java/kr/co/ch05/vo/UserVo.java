package kr.co.ch05.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
	
	private String uid;
	private String name;
	private String hp;
	private int age;
}
