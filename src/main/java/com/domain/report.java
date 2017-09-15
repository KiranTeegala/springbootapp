package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="report")
public class report {
	@Id
	@Column(name="rid")
	private int rid;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="gender")
	private String gender;
	@Column(name="memberid")
	private String memberId;
	@Column(name="typeofaccident")
	private String typeOfAccident;
	@Column(name="daccident")
	private String dAccident;
	@Column(name="physicianname")
	private String physicianName;
	@Column(name="datetreated")
	private String dateTreated;
	@Column(name="dvisit")
	private String dVisit;
	@Column(name="claimedamount")
	private String claimedAmount;
	@Column(name="patientresponsibility")
	private String patientResponsibility;
	@Column(name="dclaim")
	private String dClaim;
	public report() {
		// TODO Auto-generated constructor stub
	}
	public report(int rid, String firstName, String lastName, String gender, String memberId, String typeOfAccident,
			String dAccident, String physicianName, String dateTreated, String dVisit, String claimedAmount,
			String patientResponsibility, String dClaim) {
		super();
		this.rid = rid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.memberId = memberId;
		this.typeOfAccident = typeOfAccident;
		this.dAccident = dAccident;
		this.physicianName = physicianName;
		this.dateTreated = dateTreated;
		this.dVisit = dVisit;
		this.claimedAmount = claimedAmount;
		this.patientResponsibility = patientResponsibility;
		this.dClaim = dClaim;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getTypeOfAccident() {
		return typeOfAccident;
	}
	public void setTypeOfAccident(String typeOfAccident) {
		this.typeOfAccident = typeOfAccident;
	}
	public String getdAccident() {
		return dAccident;
	}
	public void setdAccident(String dAccident) {
		this.dAccident = dAccident;
	}
	public String getPhysicianName() {
		return physicianName;
	}
	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}
	public String getDateTreated() {
		return dateTreated;
	}
	public void setDateTreated(String dateTreated) {
		this.dateTreated = dateTreated;
	}
	public String getdVisit() {
		return dVisit;
	}
	public void setdVisit(String dVisit) {
		this.dVisit = dVisit;
	}
	public String getClaimedAmount() {
		return claimedAmount;
	}
	public void setClaimedAmount(String claimedAmount) {
		this.claimedAmount = claimedAmount;
	}
	public String getPatientResponsibility() {
		return patientResponsibility;
	}
	public void setPatientResponsibility(String patientResponsibility) {
		this.patientResponsibility = patientResponsibility;
	}
	public String getdClaim() {
		return dClaim;
	}
	public void setdClaim(String dClaim) {
		this.dClaim = dClaim;
	}
	

}
