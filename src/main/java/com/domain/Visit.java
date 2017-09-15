package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "visit_info")
public class Visit {
@Id
@Column(name="vid")
private int vid;
@Column(name="visitdate")
private String visitdate;
@Column(name="visitprovider")
private String visitprovider;
@Column(name="problem")
private String problem;
@Column(name="deductible")
private String deductible;
@Column(name="copay")
private String copay;
@Column(name="coinsurance")
private String coinsurance;
@Column(name="insuranceclaimed")
private String  insuranceclaimed;
@Column(name="totalamount")
private String totalamount;
@Column(name="pid")
private int pid;

public Visit() {
	// TODO Auto-generated constructor stub
}

public Visit(int vid, String visitdate, String visitprovider, String problem, String deductible, String copay,
		String coinsurance, String insuranceclaimed, String totalamount, int pid) {
	super();
	this.vid = vid;
	this.visitdate = visitdate;
	this.visitprovider = visitprovider;
	this.problem = problem;
	this.deductible = deductible;
	this.copay = copay;
	this.coinsurance = coinsurance;
	this.insuranceclaimed = insuranceclaimed;
	this.totalamount = totalamount;
	this.pid = pid;
}
public int getVid() {
	return vid;
}
public void setVid(int vid) {
	this.vid = vid;
}
public String getVisitdate() {
	return visitdate;
}
public void setVisitdate(String visitdate) {
	this.visitdate = visitdate;
}
public String getVisitprovider() {
	return visitprovider;
}
public void setVisitprovider(String visitprovider) {
	this.visitprovider = visitprovider;
}
public String getProblem() {
	return problem;
}
public void setProblem(String problem) {
	this.problem = problem;
}
public String getDeductible() {
	return deductible;
}
public void setDeductible(String deductible) {
	this.deductible = deductible;
}
public String getCopay() {
	return copay;
}
public void setCopay(String copay) {
	this.copay = copay;
}
public String getCoinsurance() {
	return coinsurance;
}
public void setCoinsurance(String coinsurance) {
	this.coinsurance = coinsurance;
}
public String getInsuranceclaimed() {
	return insuranceclaimed;
}
public void setInsuranceclaimed(String insuranceclaimed) {
	this.insuranceclaimed = insuranceclaimed;
}
public String getTotalamount() {
	return totalamount;
}
public void setTotalamount(String totalamount) {
	this.totalamount = totalamount;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}

}
