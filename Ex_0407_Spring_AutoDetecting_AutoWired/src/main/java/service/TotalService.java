package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import dao.DeptDAO;
import vo.DeptVO;

@Service
public class TotalService {

	private DeptDAO dept_dao; // @Repository("dept_dao") <-- 이름을 같게 해준다.
	
	@Autowired
	public TotalService(DeptDAO dept_dao) {
		this.dept_dao = dept_dao;
		System.out.println("dept_dao : " + dept_dao);
		System.out.println("--TotalService() 생성자가 만들어졌어요--");
	} // end of constructor
	
	public List<DeptVO> seletList(){
		List<DeptVO> list = dept_dao.selectList();
		return list;
	} // end of selectList()
	
	
} // end of class
