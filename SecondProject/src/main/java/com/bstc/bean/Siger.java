package com.bstc.bean;

/**
 * Word 授权签字人及领域
 * */
public class Siger {
	
	private String uuid;   //主键
	private String peopleId;    //序号
	private String name;   //姓名
	private String signArea;   //授权签字领域
	private String remarks;   //备注
	private String companyId; //公司id外键
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getPeopleId() {
		return peopleId;
	}
	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSignArea() {
		return signArea;
	}
	public void setSignArea(String signArea) {
		this.signArea = signArea;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Siger [uuid=" + uuid + ", peopleId=" + peopleId + ", name=" + name + ", signArea=" + signArea
				+ ", remarks=" + remarks + ", companyId=" + companyId + ", status=" + status + "]";
	}

	
	
	
	
	
	
}
