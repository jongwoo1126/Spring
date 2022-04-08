package kr.co.staff.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.staff.vo.StaffVo;


@Repository
public interface StaffDao {
	public void insertStaff(StaffVo vo);
	public StaffVo selectStaff(int stf_no);
	public List<StaffVo> selectStaffs();
	public void updateStaff(StaffVo vo);
	public void deleteStaff(int stf_no);
}
