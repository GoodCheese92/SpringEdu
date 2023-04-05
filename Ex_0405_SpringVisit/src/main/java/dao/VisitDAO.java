package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.VisitVO;

public class VisitDAO {
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	} // end of setter
	
	// 방명록 전체 조회
	public List<VisitVO> selectList(){
		List<VisitVO> visit_list = sqlSession.selectList("v.visit_list");
		return visit_list;
	} // end of selectList()
	
	// 새 글 추가
	public int insert(VisitVO vo) {
		int res = sqlSession.insert("v.visit_insert", vo);
		return res;
	} // end of insert()
	
	// 글 삭제
	public int delete(int idx) {
		int res = sqlSession.delete("v.visit_delete", idx);
		return res;
	} // end of delete()
	
} // end of class
