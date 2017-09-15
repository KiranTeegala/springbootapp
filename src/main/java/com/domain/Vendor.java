package com.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vendor_details")
public class Vendor {
	@Id
	@Column(name="vendor_id")
	private int vendor_id;
	
	@ManyToOne(cascade ={CascadeType.ALL})
	@JoinColumn(name="idref")
	private Ref ref;
	
	@Column(name="vendor_companyname")
	private String vendorCompanyName;
	
	@Column(name="person_name")
	private String personName;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="position_location")
	private String position_location;
	
	@Column(name="position_title")
	private String position_title;
	
	@Column(name="submitted_status")
	private String submitted_status;
	
	private String client;
	
	@Column(name="submitted_date")
	private Date submitted_date;
	
	@Column(name="submitted_by")
	private String submitted_by;
	
	@ManyToOne(cascade ={CascadeType.ALL})
	@JoinColumn(name="userid")
	private UserSignup user;
	
	public String getSubmittedBy() {
		return submitted_by;
	}
	public void setSubmittedBy(String submittedBy) {
		this.submitted_by = submittedBy;
	}
	public Ref getRef() {
		return ref;
	}
	public void setRef(Ref ref) {
		this.ref = ref;
	}
	public UserSignup getUser() {
		return user;
	}
	public void setUser(UserSignup user) {
		this.user = user;
	}
//	public void setVendorCompanyName(String vendorCompanyName) {
//		this.vendorCompanyName = vendorCompanyName;
//	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
//	public Ref getVendorCompanyName() {
//		return ref;
//	}
//	public void setVendorCompanyName(Ref vendorCompanyName) {
//		this.ref = vendorCompanyName;
//	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPosition_location() {
		return position_location;
	}
	public void setPosition_location(String position_location) {
		this.position_location = position_location;
	}
	public String getPosition_title() {
		return position_title;
	}
	public void setPosition_title(String position_title) {
		this.position_title = position_title;
	}
	public String getVendorCompanyName() {
		return vendorCompanyName;
	}
	public void setVendorCompanyName(String vendorCompanyName) {
		this.vendorCompanyName = vendorCompanyName;
	}
	public String getSubmitted_by() {
		return submitted_by;
	}
	public void setSubmitted_by(String submitted_by) {
		this.submitted_by = submitted_by;
	}
	public String getSubmitted_status() {
		return submitted_status;
	}
	public void setSubmitted_status(String submitted_status) {
		this.submitted_status = submitted_status;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public Date getSubmitted_date() {
		return submitted_date;
	}
	public void setSubmitted_date(Date submitted_date) {
		this.submitted_date = submitted_date;
	}
	
	
}