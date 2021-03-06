package kr.co.ch06.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.ch06.vo.CustomerVo;

@Mapper
@Repository
public interface CustomerDao {
	public void insertCustomer(CustomerVo vo);
	public CustomerVo selectCustomer(int custid);
	public List<CustomerVo> selectCustomers();
	public void updateCustomer(CustomerVo vo);
	public void deleteCustomer(int custid);
}
