package kr.co.Sboard1.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

	@GetMapping(value={"", "/index"})
	public String login() {
		
		return "/index";
	}
}
