package kr.co.ch07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch07.presistence.UserRepo;
import kr.co.ch07.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public void insertUser(UserVo vo) {
		repo.save(vo);
	}

	public UserVo selectUser(String uid) {
		
		return repo.findById(uid).get();
	}
	
	
	public List<UserVo> selectUsers() {
		return repo.findAll();
	}
	
	public List<UserVo> selectUsersOrderByName() {
		return repo.findUserVoByOrderByName();
	}

	public List<UserVo> selectUsersOrderByAgeAsc() {
		return repo.findUserVoByOrderByAgeAsc();
	}
	
	public List<UserVo> selectUsersOrderByAgeDesc() {
		return repo.findUserVoByOrderByAgeDesc();
	}
	
	public List<UserVo> selectUsersUnderAge30() {
		return repo.selectUsersUnderAge30();
	}
	
	public void updateUser(UserVo vo) {
		repo.save(vo);
	}

	public void deleteUser(String uid) {
		repo.deleteById(uid);
	};
	
}
