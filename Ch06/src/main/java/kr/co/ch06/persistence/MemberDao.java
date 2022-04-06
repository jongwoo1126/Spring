package kr.co.ch06.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.ch06.vo.MemberVo;
import kr.co.ch06.vo.UserVo;

@Repository
public interface MemberDao {
	public void insertMember(MemberVo vo);
	public void selectMember();
	public void selectMembers();
	public void updateMember();
	public void deleteMember();
}
