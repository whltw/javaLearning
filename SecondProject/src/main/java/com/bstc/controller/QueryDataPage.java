package com.bstc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QueryDataPage {
	
	@RequestMapping("/queryData")
	public String queryData() {
		return"queryData";
	}
}
