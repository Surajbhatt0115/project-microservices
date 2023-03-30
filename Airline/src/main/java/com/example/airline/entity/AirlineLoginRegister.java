package com.example.airline.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "airlinelogin")
public class AirlineLoginRegister {

	@Id
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="password",unique=true)
	private String password;
	@Column(name ="name")
	private String name;
	@Column(name="phoneno")
	private int phoneno;

	public AirlineLoginRegister()
	{
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}
