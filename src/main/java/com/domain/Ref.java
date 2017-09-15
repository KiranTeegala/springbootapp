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
@Table(name = "ref")
public class Ref {

	@Id
    @Column(name="idref")
	private int idref;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="ref" , fetch=FetchType.EAGER, cascade ={CascadeType.ALL})
	private List<Vendor> companies;
	
	
	public List<Vendor> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Vendor> companies) {
		this.companies = companies;
	}

	public Ref() {
		super();
	
	}
	
	public int getIdref() {
		return idref;
	}


	public void setIdref(int idref) {
		this.idref = idref;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}