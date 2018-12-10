package com.bstc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bstc.bean.CompanyBean;
import com.bstc.bean.PageBean;
import com.bstc.dao.CompanyInfoDao;
import com.sun.org.apache.xml.internal.utils.StringComparable;

@Service
public class CompanyService {
	@Autowired
	private CompanyInfoDao companyInfoDao;
	
	public CompanyBean getCompanyInfoById(String companyId) {
		CompanyBean companyInfoById = companyInfoDao.getCompanyInfoById(companyId);
		System.out.println(companyInfoById);
		return companyInfoById;
	}
	
	public PageBean<CompanyBean> getCompanyInfoByIdOrName(String companyId,String companyName,int pageNum,int pageSize) {
		
		int totalNum = companyInfoDao.getCountCompany(companyId,companyName);
		PageBean<CompanyBean> pageBean = new PageBean<CompanyBean>(pageNum, pageSize, totalNum);
		List<CompanyBean> companyInfoById = companyInfoDao.getCompanyInfoByIdOrName(companyId,companyName,(pageNum-1)*pageSize,pageSize);	
		pageBean.setList(companyInfoById);
		return pageBean;
	}
	
}
