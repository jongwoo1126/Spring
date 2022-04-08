package kr.co.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.staff.service.StaffService;
import kr.co.staff.vo.StaffVo;

@Controller
public class MainController {

	@Autowired
	private StaffService service;
	
	@GetMapping("/register")
	public String register() {
		return "/register";
	}
	
	@PostMapping("/register")
	public String register(StaffVo vo) {
		
		// 등록요청
		service.insertStaff(vo);
		
		return "redirect:/register";
	}
	
	@GetMapping(value = {"/", "/list"})
	public String list(Model model) {
		
		// 데이터 요청
		List<StaffVo> staffs = service.selectStaffs();
		model.addAttribute("staffs", staffs);
		return "/list";
	}
	
	@GetMapping("/modify")
	public String modify(int stf_no, Model model) {
		
		// 수정데이터 요청
		StaffVo staff = service.selectStaff(stf_no);
		model.addAttribute("staff",staff);
		
		return "/modify";
	}
	
	@PostMapping("/modify")
	public String modify(StaffVo vo) {
		
		// 수정 요청
		service.updateStaff(vo);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String delete(int stf_no) {
		
		// 수정데이터 요청
		service.deleteStaff(stf_no);
		
		return "redirect:/list";
	}
}
