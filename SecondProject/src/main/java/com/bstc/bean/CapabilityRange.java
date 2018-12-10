package com.bstc.bean;

public class CapabilityRange {
	private String uuid ; //主键
	private String ablityRangeId;  //第一列序号
	private String checkRange;   //检测对象
	private String parId; //参数id
	private String name;  //参数name
	private String method; //检测方法
	private String limitRange;//限制范围
	private String remarks; //备注说明
	private String companyId;//外键
	private String status;//状态
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
	public String getCheckRange() {
		return checkRange;
	}
	public void setCheckRange(String checkRange) {
		this.checkRange = checkRange;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMethod() {
		return method;
	}
	public String getAblityRangeId() {
		return ablityRangeId;
	}
	public void setAblityRangeId(String ablityRangeId) {
		this.ablityRangeId = ablityRangeId;
	}
	public String getParId() {
		return parId;
	}
	public void setParId(String parId) {
		this.parId = parId;
	}
	public String getLimitRange() {
		return limitRange;
	}
	public void setLimitRange(String limitRange) {
		this.limitRange = limitRange;
	}
	public void setMethod(String method) {
		this.method = method;
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
		return "CapabilityRange [uuid=" + uuid + ", ablityRangeId=" + ablityRangeId + ", checkRange=" + checkRange
				+ ", parId=" + parId + ", name=" + name + ", method=" + method + ", limitRange=" + limitRange
				+ ", remarks=" + remarks + ", companyId=" + companyId + "]";
	}
	
	
	
	
	
}
