package com.crmapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="clientdetails")
public class Client extends AbstractClass {
	@Column(name="first_name",nullable=false)
	private String firstname;
	
	@Column(name="last_name",nullable=false)
	private String lastname;
	
	@Column(name="email",nullable=false,unique=true)
	private String email;
	
	@Column(name="mobile",nullable=false,unique=true)
	private Long mobile;

	private String source;
	
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public String getemail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getmobile() {
		return mobile;
	}
	public void setmobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getsource() {
		return source;
	}
	public void setsource(String source) {
		this.source = source;
	}
	
	
	

}
