package kr.co.farmstory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.farmstory.dao.UserDao;
import kr.co.farmstory.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public void insertUser(UserVo vo) {
		
		dao.insertUser(vo);
	}
	
	public UserVo selectUser(String uid) {
		return null;
	}
	
	public List<UserVo> selectUsers() {
		return null;
	}
	
	public void updateUser(UserVo vo) {}
	
	public void deleteUser(String uid) {}
	
}
