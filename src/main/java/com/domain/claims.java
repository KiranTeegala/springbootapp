package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claims")
public class claims {
	
	@Id
	@Column(name="claimid")
	private int claimid;
	private String provider;
	private String dateofservice;
	private String processeddate;
	private String billedamount;
	private String patientresponsibility;
	private int id;
	public int getClaimid() {
		return claimid;
	}
	public void setClaimid(int claimid) {
		this.claimid = claimid;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getDateofservice() {
		return dateofservice;
	}
	public void setDateofservice(String dateofservice) {
		this.dateofservice = dateofservice;
	}
	public String getProcesseddate() {
		return processeddate;
	}
	public void setProcesseddate(String processeddate) {
		this.processeddate = processeddate;
	}
	public String getBilledamount() {
		return billedamount;
	}
	public void setBilledamount(String billedamount) {
		this.billedamount = billedamount;
	}
	public String getPatientresponsibility() {
		return patientresponsibility;
	}
	public void setPatientresponsibility(String patientresponsibility) {
		this.patientresponsibility = patientresponsibility;
	}
	
	
	public claims() {
		// TODO Auto-generated constructor stub
	}
	public claims(int claimid, String provider, String dateofservice, String processeddate, String billedamount,
			String patientresponsibility, int id) {
		super();
		this.claimid = claimid;
		this.provider = provider;
		this.dateofservice = dateofservice;
		this.processeddate = processeddate;
		this.billedamount = billedamount;
		this.patientresponsibility = patientresponsibility;
		this.setId(id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
