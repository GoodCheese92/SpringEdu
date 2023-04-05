package com.korea.visit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.VisitDAO;
import util.MyCommon;
import vo.VisitVO;

@Controller
public class VisitController {
	
	VisitDAO visit_dao;
	
	public void setVisit_dao(VisitDAO visit_dao) {
		this.visit_dao = visit_dao;
	} // end of setter
	
	// 방명록 전체정보 조회
	@RequestMapping(value = {"/","/visit_list.do"})
	public String selectList(Model model) {
		List<VisitVO> visit_list = visit_dao.selectList();
		model.addAttribute("visit_list", visit_list); // 바인딩
		
		return MyCommon.Visit.VIEW_PATH + "visit_list.jsp"; // 포워딩
	} // end of selectList()
	
	// insert_form
	@RequestMapping("/visit_insert_form.do")
	public String insert_form() {
		return MyCommon.Visit.VIEW_PATH + "visit_insert_form.jsp";
	} // end of inser_form()
	
	// 글 등록
	@RequestMapping("/visit_insert.do")
	public String insert(VisitVO vo, HttpServletRequest request) {
		// visit_insert.do?name=홍길동&content=내용&pwd=1111
		// vo파라미터를 통해 이름, 내용, 비밀번호는 이미 받아온 상태
		String ip = request.getRemoteAddr(); 
		vo.setIp(ip);
		
		visit_dao.insert(vo);
		
		// sendRedirect("visit_list.do")
		return "redirect:visit_list.do"; // url매핑을 호출
	} // end of insert()
	
	// 글 삭제
	@RequestMapping("/visit_delete.do")
	@ResponseBody // Ajax로 요청된 메서드가 반드시 가지고 있어야 하는 Annotation
	public String delete(int idx) {
		// visit_delete.do?idx=2
		int res = visit_dao.delete(idx);
		
		String result = "no";
		if(res != 0) {
			result = "yes";
		}
		
		// @ResponseBody의 속성을 통해 반환된 result값이 자동으로 콜백메서드로 전달
		return result;
	} // end of delete()
	
} // end of class
