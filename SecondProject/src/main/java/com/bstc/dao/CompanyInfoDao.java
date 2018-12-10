package com.bstc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bstc.bean.CompanyBean;


public interface CompanyInfoDao {
	public CompanyBean getCompanyInfoById(String id);
	public List<CompanyBean> getCompanyInfoByIdOrName(@Param("id")String id,@Param("companyName")String companyName,@Param("pageNumFirstDataLocation") int pageNumFirstDataLocation,@Param("pageSize") int pageSize);
	public int getCountCompany(@Param("id")String id,@Param("companyName")String companyName);
}
