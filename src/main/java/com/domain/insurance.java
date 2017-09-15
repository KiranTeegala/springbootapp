package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "insurance_type")
public class insurance {

	@Id
	private int id;
	@Column(name = "membership_type")
	private String membershipType;
	private String metallic_type;
	private String premium;
	private String deductible;
	private String co_insurance;
	private String copay;
	private String out_of_pocket;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	public String getMetallic_type() {
		return metallic_type;
	}
	public void setMetallic_type(String metallic_type) {
		this.metallic_type = metallic_type;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getDeductible() {
		return deductible;
	}
	public void setDeductible(String deductible) {
		this.deductible = deductible;
	}
	public String getCo_insurance() {
		return co_insurance;
	}
	public void setCo_insurance(String co_insurance) {
		this.co_insurance = co_insurance;
	}
	public String getCopay() {
		return copay;
	}
	public void setCopay(String copay) {
		this.copay = copay;
	}
	public String getOut_of_pocket() {
		return out_of_pocket;
	}
	public void setOut_of_pocket(String out_of_pocket) {
		this.out_of_pocket = out_of_pocket;
	}
	public insurance(int id, String membershipType, String metallic_type, String premium, String deductible,
			String co_insurance, String copay, String out_of_pocket) {
		super();
		this.id = id;
		this.membershipType = membershipType;
		this.metallic_type = metallic_type;
		this.premium = premium;
		this.deductible = deductible;
		this.co_insurance = co_insurance;
		this.copay = copay;
		this.out_of_pocket = out_of_pocket;
	}
	public insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
