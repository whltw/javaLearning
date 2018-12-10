package com.bstc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bstc.bean.Person;
import com.bstc.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
//	@RequestMapping("/test")
//	public String test() {
//		
//		return "success";
//	}
	
	@RequestMapping("/test")
	public String test() {
		int j = testService.getNum();
		System.out.println("j:" + j);
		return "success";
	}
	
	@RequestMapping("/test2")
	public String test2(HttpServletRequest request){
		Person p = testService.getPerson();
		System.out.println(p);
		request.setAttribute("person", p);
		return "success";
	}
}
