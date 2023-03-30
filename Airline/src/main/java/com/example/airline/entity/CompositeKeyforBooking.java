package com.example.airline.entity;

import java.io.Serializable;

public class CompositeKeyforBooking implements Serializable{
	

	private String flightnumber;
	private String email;
	private String name;
	
	public CompositeKeyforBooking() {
	}
	
	public CompositeKeyforBooking(String flightnumber, String email, String name) {
		this.flightnumber = flightnumber;
		this.email = email;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	
}
