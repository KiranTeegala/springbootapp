package com.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient_info")
public class Patient {
	
	
	@Id
    @Column(name="id")
	private int id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	private String age;
	private String dob;
	private String gender;
	private String email;
	private String mobile;
	private String address;
	@Column(name="countryoforigin")
	private String countryOfOrigin;
	@Column(name="membership_type")
	private String membershipType;
	private String smoking;
	private String alcohol;
	private String height;
	private String weight;
	@Column(name="drugaddict")
	private String drugaddict;
	@Column(name="mentalillness")
	private String mentalillness;
	@Column(name="accountbalance")
	private String accountbalance;
	private String username;
	private String password;
	private String metallic_type;
	
	public Patient() {
		super();
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public String getSmoking() {
		return smoking;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDrugaddict() {
		return drugaddict;
	}

	public void setDrugadict(String drugadict) {
		this.drugaddict = drugadict;
	}

	public String getMentalillness() {
		return mentalillness;
	}

	public void setMentalillness(String mentalillness) {
		this.mentalillness = mentalillness;
	}

	public String getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(String accountbalance) {
		this.accountbalance = accountbalance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMetallic_type() {
		return metallic_type;
	}

	public void setMetallic_type(String metallic_type) {
		this.metallic_type = metallic_type;
	}

	public Patient(int id, String firstname, String lastname, String age, String dob, String gender, String email,
			String mobile, String address, String countryOfOrigin, String membershipType, String smoking,
			String alcohol, String height, String weight, String drugadict, String mentalillness, String accountbalance,
			String username, String password, String metallic_type) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.countryOfOrigin = countryOfOrigin;
		this.membershipType = membershipType;
		this.smoking = smoking;
		this.alcohol = alcohol;
		this.height = height;
		this.weight = weight;
		this.drugaddict = drugadict;
		this.mentalillness = mentalillness;
		this.accountbalance = accountbalance;
		this.username = username;
		this.password = password;
		this.metallic_type = metallic_type;
	}

	
}
