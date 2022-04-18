package kr.co.Sboard1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.Sboard1.vo.UserVo;

@SessionAttributes("sessUser")
@Controller
public class MainController {

	@ModelAttribute("sessUser")
	public UserVo setUserVo() {
		return null;
	}
	
	@GetMapping(value={"", "/index"})
	public String login(@ModelAttribute("sessUser") UserVo sessUser) {
		// 로그인 체크
		if(sessUser == null) {
			return "redirect:/user/login?success=102";
		}else {
			return "forward:/article/list";
		}
		
	}
}
