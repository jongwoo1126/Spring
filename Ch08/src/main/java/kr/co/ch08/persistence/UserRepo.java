package kr.co.ch08.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ch08.vo.UserVo;

public interface UserRepo extends JpaRepository<UserVo, String>{

}
