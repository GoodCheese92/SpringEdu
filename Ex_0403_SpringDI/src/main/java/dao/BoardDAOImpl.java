package dao;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO{
	
	@Override
	public int insert(Object ob) {
		return 0;
	}

	@Override
	public List<String> selectList() {
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("수박");
		list.add("참외");
		list.add("복숭아");
		return list;
	} // end of selectList()

	@Override
	public int update(Object ob) {
		return 0;
	}

	@Override
	public int delete(int idx) {
		return 0;
	}

} // end of class
