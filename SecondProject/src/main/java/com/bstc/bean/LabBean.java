package com.bstc.bean;

public class LabBean {//{"adressCode","adress","facilities","activities","remarks",status"}
	private String uuid; //主键
	private String companyId;//外键
	private String adressCode; //地址代码
	private String adress;//地址邮编
	private String facilities; //设施特点
	private String activities; //主要活动
	private String remarks; //说明
	private String status; //状态
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getAdressCode() {
		return adressCode;
	}
	public void setAdressCode(String adressCode) {
		this.adressCode = adressCode;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public String getActivities() {
		return activities;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LabBean [uuid=" + uuid + ", companyId=" + companyId + ", adressCode=" + adressCode + ", adress="
				+ adress + ", facilities=" + facilities + ", activities=" + activities + ", remarks=" + remarks
				+ ", status=" + status + "]";
	}
	
}
