package kr.co.ch03.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * 날짜 : 2022/04/04
 * 이름 : 박종우
 * 내용 : 스프링 AOP 실습히기
 */

@RestController
public class AOPTest {
	
	@Autowired
	private PointService service;
	
	@GetMapping("/test1")
	public void test1() {
		System.out.println("-------------- test1 --------------");
		service.insert();
		System.out.println("-----------------------------------");
	}

	@GetMapping("/test2")
	public void test2() {
		System.out.println("-------------- test2 --------------");
		service.select();
		System.out.println("-----------------------------------");
	}
	
	@GetMapping("/test3")
	public void test3() {
		System.out.println("-------------- test3 --------------");
		service.update();
		System.out.println("-----------------------------------");
	}
	
	@GetMapping("/test4")
	public void test4() {
		System.out.println("-------------- test4 --------------");
		service.delete();
		System.out.println("-----------------------------------");
	}
}
