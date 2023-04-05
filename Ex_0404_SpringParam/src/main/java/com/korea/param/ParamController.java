package com.korea.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.PersonVO;

@Controller
public class ParamController {
	public static final String VIEW_PATH = "/WEB-INF/views/";
	
	@RequestMapping(value = {"/", "/insert_form.do"})
	public String insert_form() {
		return VIEW_PATH + "insert_form.jsp";
	} // end of insert_form()
	
	@RequestMapping("/insert1.do")
	public String insert1(Model model, String name, int age, String tel) {
		// insert1.do?name=홍길동&age=25&tel=010-1111-1111
		
		// name, age, tel이 파라미터로 자동으로 넘어온다.
		// int 타입의 경우 자동으로 형 변환까지 처리
		
		// 넘겨받은 세 개의 파라미터를 vo에 담아서 바인딩
		PersonVO vo = new PersonVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setTel(tel);
		
		model.addAttribute("vo", vo);
		
		return VIEW_PATH + "insert_result.jsp";
	} // end of insert1()
	
	// send2()에 대한 처리
	@RequestMapping("/insert2.do")
	public String insert2(Model model, PersonVO vo) {
		model.addAttribute("vo", vo);
		return VIEW_PATH + "insert_result.jsp";
		
		// insert2(Model model, PersonVO vo, String name){}
		// vo에 있는 변수명으로 파라미터를 또 받으면 오류 발생
		// 위와 같이 vo에 이미 존재하는 변수를 파라미터로 또 받게되면 실행 시 오류 발생.
	} // end of insert2()
	
} // end of class



























