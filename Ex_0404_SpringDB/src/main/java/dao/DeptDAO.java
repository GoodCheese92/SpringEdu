package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.DeptVO;

public class DeptDAO {
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	} // end of setter
	
	// 전체목록 조회
	public List<DeptVO> selectList(){
		List<DeptVO> dept_list = sqlSession.selectList("d.dept_list");
		return dept_list;
	} // end of selectList()
	
	
	
} // end of class
