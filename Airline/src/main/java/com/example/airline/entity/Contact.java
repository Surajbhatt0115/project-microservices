package com.example.airline.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {

	//constructor
	public Contact() {
	}
	// parametrized constructor
	public Contact(String email, String name, String subject, String message) {
		this.email = email;
		this.name = name;
		this.subject = subject;
		this.message = message;
	}
	
	
@Id
@Column(name="email")
private String email;
@Column(name="name")
private String name;
@Column(name="subject")
private String subject;
@Column(name="message")
private String message;


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}


}
