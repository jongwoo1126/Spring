package kr.co.staff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.staff.persistence.StaffDao;
import kr.co.staff.vo.StaffVo;


@Service
public class StaffService {
	
	@Autowired
	private StaffDao dao;
	
	public void insertStaff(StaffVo vo) {
		dao.insertStaff(vo);
	};
	public StaffVo selectStaff(int stf_no) {
		return dao.selectStaff(stf_no);
	};
	public List<StaffVo> selectStaffs() {
		return dao.selectStaffs();
	};
	public void updateStaff(StaffVo vo) {
		dao.updateStaff(vo);
	};
	public void deleteStaff(int stf_no) {
		dao.deleteStaff(stf_no);
	};
	
}
