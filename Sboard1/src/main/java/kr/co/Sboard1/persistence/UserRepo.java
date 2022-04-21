package kr.co.Sboard1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.Sboard1.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, String>{
	
	// JPA 쿼리 메서드 작성법
	// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
		
	// JPA Count 쿼리 메서드	
	public int countUserVoByUid(String uid);
	public int countUserVoByNick(String nick);
	public int countUserVoByEmail(String email);
	
}
