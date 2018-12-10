package com.bstc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bstc.bean.CompanyBean;
import com.bstc.bean.PageBean;
import com.bstc.enumData.EnumPage;
import com.bstc.service.CompanyService;

@Controller
public class CompanyInfoController {
	@Autowired
	private CompanyService companyService;
	@RequestMapping("/companyInfoById")
	public ModelAndView getCompanyInfoById() {
		CompanyBean companyInfoById = companyService.getCompanyInfoById("L4609");
		
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("sigleCompany", companyInfoById);
		return modelAndView;
	}
	
	@RequestMapping(value="/companyInfoByIdOrName",method=RequestMethod.GET)
	public ModelAndView getCompanyInfoByIdOrName(String id,String companyName, int pageNum) {
		String queryCondition ="id="+id+"&"+"companyName="+companyName;
		if(id=="")
			id=null;
		if(companyName=="")
			companyName=null;
		
		System.out.println("id"+id+ companyName);
		PageBean<CompanyBean> companyInfoById = companyService.getCompanyInfoByIdOrName(id,companyName,pageNum,EnumPage.PAGE_SIZE);
		companyInfoById.setQueryCondition(queryCondition);
		ModelAndView modelAndView = new ModelAndView("queryData");
		modelAndView.addObject("sigleCompanyList", companyInfoById);
		return modelAndView;
	}
}
