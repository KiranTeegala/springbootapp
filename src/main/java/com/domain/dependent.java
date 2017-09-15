package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="dependent")
public class dependent {
	
	public dependent() {
		// TODO Auto-generated constructor stub
	}

	 @Id
     @Column(name="id")
     private int id;
	 
	 @Column(name ="username")
	 private String username;
	 
	 @Column(name = " dep_id")
	 private String id2;
	 @Column(name= "relation")
	 private String relation;
	 @Column(name ="name")
	 private String name;
	 public dependent(int id, String username, String dep_id, String relation, String name, String gender, String age) {
		super();
		this.id = id;
		this.username = username;
		this.id2 = dep_id;
		this.relation = relation;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(name ="gender")
	 private String gender;
	 
	 @Column(name ="age")
	 private String age;
	 
	 
}
