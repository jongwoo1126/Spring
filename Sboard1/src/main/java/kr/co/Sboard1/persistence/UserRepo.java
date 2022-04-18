package kr.co.Sboard1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.Sboard1.vo.UserVo;

public interface UserRepo extends JpaRepository<UserVo, String>{

	// JPA Count 쿼리 메서드
	public int countUsertVoByUid(String uid);
	//public int countUsertVoByUid(String nick);
	//public int countUsertVoByUid(String email);
}
