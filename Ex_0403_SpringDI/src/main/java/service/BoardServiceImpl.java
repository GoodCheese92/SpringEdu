package service;

import java.util.List;

import dao.BoardDAOImpl;

public class BoardServiceImpl implements BoardService{
	
	BoardDAOImpl dao;
	
	public BoardServiceImpl(BoardDAOImpl dao) {
		// 나중에 ServiceImpl가 생성될 때 DAO객체를 생성자로 받을 예정
		this.dao = dao;
	} // end of constructor
	
	@Override
	public List<String> selectList() {

		return dao.selectList();
	} // end of selectList()
	
	
} // end of class
