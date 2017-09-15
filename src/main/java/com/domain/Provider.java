package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "provider_visit")

public class Provider {
	
	
	@Id
    @Column(name="pid")
	private int pid;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="membership_type")
	private String membershipType;
	@Column(name="hospital_visits")
	private String hospitalVisits;
	@Column(name="metallic_type")
	private String metallictype;
	
	

	
	
	public Provider() {
		super();
		
	}

	public Provider(int id, String firstName, String lastName, String membershipType, 
			String hospitalVisits, String metallictype) {
		super();
		this.pid = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.membershipType = membershipType;
		this.hospitalVisits = hospitalVisits;
		this.metallictype = metallictype;
		
		
	}
	
	public int getPId() {
		return pid;
	}

	public void setPId(int pid) {
		this.pid = pid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public String getHospitalVisits() {
		return hospitalVisits;
	}

	public void setHospitalVisits(String hospitalVisits) {
		this.hospitalVisits = hospitalVisits;
		
	}

	public String getMetallictype() {
		return metallictype;
	}

	public void setMetallictype(String metallictype) {
		this.metallictype = metallictype;
	}
	

	
	
	

	
	
}