package com.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_signup")
public class UserSignup {
	
	@Id
    @Column(name="userid")
	private int userid;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="phonenumber")
	private String phonenumber;
	@Column(name="role")
	private String role;
	
	@OneToMany( mappedBy="user", fetch=FetchType.EAGER, cascade ={CascadeType.ALL})
	private List<Vendor> marketers;
	
	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public List<Vendor> getMarketers() {
		return marketers;
	}


	public void setMarketers(List<Vendor> marketers) {
		this.marketers = marketers;
	}

//
//	public List<Vendor> getConsultants() {
//		return consultants;
//	}
//
//
//	public void setConsultants(List<Vendor> consultants) {
//		this.consultants = consultants;
//	}


	public UserSignup() {
		super();
	
	}
	
	
	public int getuserId() {
		return userid;
	}
	public void setuserId(int userid) {
		this.userid = userid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}