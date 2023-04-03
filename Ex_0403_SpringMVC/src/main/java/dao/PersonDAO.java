package dao;

import java.util.ArrayList;
import java.util.List;

import vo.PersonVO;

public class PersonDAO {
	public PersonDAO() {
		System.out.println("---PersonDAO()의 생성자---");
	} // end of constructor
	
	// 회원목록 조회
	public List<PersonVO> selectList(){
		List<PersonVO> list = new ArrayList<PersonVO>();
		PersonVO p1 = new PersonVO("홍길동", "010-111-1111", 30);
		PersonVO p2 = new PersonVO("이길동", "010-222-2222", 23);
		PersonVO p3 = new PersonVO("삼길동", "010-333-3333", 27);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		return list;
	} // end of selectList()
	
} // end of class
