package com.korea.db;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.DeptDAO;
import vo.DeptVO;

@Controller
public class DeptController {
	public static final String VIEW_PATH = "/WEB-INF/views/dept/";
	
	DeptDAO dept_dao;
	
	public DeptController(DeptDAO dept_dao) {
		this.dept_dao = dept_dao;
		System.out.println("DeptController 생성자 : " + dept_dao);
	} // end of constructor
	
	// 전체조회
	@RequestMapping(value = {"/", "dept_list.do"})
	public String selectList(Model model) {
		// dept_dao로부터 전체목록을 가져온다.
		List<DeptVO> dept_list = dept_dao.selectList();
		
		// 바인딩
		model.addAttribute("dept_list", dept_list);
		
		// 포워딩
		return VIEW_PATH + "dept_list.jsp";
		
		// sendRedirect("list.do")
		// return "redirect:list.do";
	} // end of selectList()
} // end of class
