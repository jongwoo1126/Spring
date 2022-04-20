package kr.co.ch06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch06.service.MemberService;
import kr.co.ch06.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	@PostMapping("/member/register")
	public String register(MemberVo vo) {
		
		// 등록요청
		service.insertMemeber(vo);
		
		return "redirect:/member/register";
	}
	
	@GetMapping("/member/list")
	public String list(Model model) {
		
		// 데이터 요청
		List<MemberVo> members = service.selectMembers();
		model.addAttribute("members", members);
		return "/member/list";
	}
	
	@GetMapping("/member/modify")
	public String modify(String uid, Model model) {
		
		// 수정데이터 요청
		MemberVo member = service.selectMember(uid);
		model.addAttribute("member",member);
		
		return "/member/modify";
	}
	
	@PostMapping("/member/modify")
	public String modify(MemberVo vo) {
		
		// 수정 요청
		service.updateMember(vo);
		return "redirect:/member/list";
	}
	
	@GetMapping("/member/delete")
	public String delete(String uid) {
		
		// 수정데이터 요청
		service.deleteMember(uid);
		
		return "redirect:/member/list";
	}
	
}
