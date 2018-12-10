package com.bstc.bean;

public class CompanyBean {//{"id","reportName","linkMan","linkTel","postalCode","faxNO","webAdress","email","companyAdress","validity","PauseProject"}
	private String id; //注册编号
	private String companyName;//公司名
	private String reportName; //报告/证书允许使用认可标识的其他名称
	private String linkMan; //联系人
	private String linkTel; //联系电话
	private String postalCode; //邮政编码
	private String faxNO; //传真号码
	private String webAdress; //网站地址
	private String email; //电子邮箱
	private String companyAdress; //公司地址
	private String validity; //认可有效期
	private String pauseProject; //暂停项目/参数
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	public String getLinkTel() {
		return linkTel;
	}
	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getFaxNO() {
		return faxNO;
	}
	public void setFaxNO(String faxNO) {
		this.faxNO = faxNO;
	}
	public String getWebAdress() {
		return webAdress;
	}
	public void setWebAdress(String webAdress) {
		this.webAdress = webAdress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyAdress() {
		return companyAdress;
	}
	public void setCompanyAdress(String companyAdress) {
		this.companyAdress = companyAdress;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getPauseProject() {
		return pauseProject;
	}
	public void setPauseProject(String pauseProject) {
		this.pauseProject = pauseProject;
	}
	@Override
	public String toString() {
		return "CompanyBean [id=" + id + ", companyName=" + companyName + ", reportName=" + reportName + ", linkMan="
				+ linkMan + ", linkTel=" + linkTel + ", postalCode=" + postalCode + ", faxNO=" + faxNO + ", webAdress="
				+ webAdress + ", email=" + email + ", companyAdress=" + companyAdress + ", validity=" + validity
				+ ", pauseProject=" + pauseProject + "]";
	}
	
}
