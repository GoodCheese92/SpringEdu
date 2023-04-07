package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.TotalService;
import vo.DeptVO;

@Controller
public class TestController {
	
	TotalService service;
	
	@Autowired
	public TestController(TotalService service) {
		this.service = service;
		System.out.println("service : " + service);
		System.out.println("--TestController가 생성됨--");
	} // end of constructor
	
	// 부서조회
	@RequestMapping(value = {"/", "/list.do"})
	public String selectList(Model model) {
		List<DeptVO> list = service.seletList();
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/dept_list.jsp";
	} // end of selectList()
	
	
} // end of class
