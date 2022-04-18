package kr.co.Sboard1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.Sboard1.vo.UserVo;

@SessionAttributes("sessUser")
@Controller
public class ArticleCotroller {

	@ModelAttribute("sessUser")
	public UserVo setUserVo() {
		return null;
	}
	
	@GetMapping("/article/list")
	public String list(@ModelAttribute("sessUser") UserVo sessUser) {
		// 로그인 체크
		if (sessUser == null) {
			return "redirect:/user/login?success=102";
		}
		
		return "/article/list";
	}

	@GetMapping("/article/modify")
	public String modify() {
		return "/article/modify";
	}
	
	@GetMapping("/article/view")
	public String view() {
		return "/article/view";
	}
	
	@GetMapping("/article/write")
	public String write() {
		return "/article/write";
	}
}
