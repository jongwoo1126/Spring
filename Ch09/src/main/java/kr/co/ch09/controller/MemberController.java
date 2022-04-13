package kr.co.ch09.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ch09.service.MemberService;
import kr.co.ch09.vo.MemberVo;


@RestController
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/Member")
	public List<MemberVo> list() {
		
		List<MemberVo> members = service.selectMembers();
		return members;
	}

	@PostMapping("/Member")
	public List<MemberVo> register(MemberVo vo) {
		service.insertMember(vo);
		return service.selectMembers();
	}
	
	@PutMapping("/Member/{uid}")
	public List<MemberVo> modify(@PathVariable("uid") String uid, MemberVo vo) {
		vo.setUid(uid);
		
		service.updateMember(vo);
		return service.selectMembers();
	}
	
	@DeleteMapping("/Member/{uid}")
	public List<MemberVo> delete(@PathVariable("uid") String uid) {
		service.deleteMember(uid);
		return service.selectMembers();
	}
}
