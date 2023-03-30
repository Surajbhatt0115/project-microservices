package com.example.flight.entity;

//import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "flightdetail")
public class Flight {

//	@Autowired
//	private Booking booking;

	@jakarta.persistence.Id
	@Column(name="flightnumber")
	private String flightnumber;
	
	@Column(name="flightname")
	private String flightName;
	
	
	
	@Column(name="takeoftime")
	private String  takeOfTime;
	
	@Column(name="landingtime")
	private String  landingTime;
	
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	//constructor
	public Flight() {
		
	}
	
	
	public Flight(String flightnumber, String flightName, String takeOfTime, String landingTime, String source,
			String destination) {
	
		this.flightnumber = flightnumber;
		this.flightName = flightName;
		this.takeOfTime = takeOfTime;
		this.landingTime = landingTime;
		this.source = source;
		this.destination = destination;
	
	}
	/*
	 * 
	 * public Booking getBooking() { return booking; }
	 * 
	 * 
	 * public void setBooking(Booking booking) { this.booking = booking; }
	 */

	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getTakeOfTime() {
		return takeOfTime;
	}
	public void setTakeOfTime(String takeOfTime) {
		this.takeOfTime = takeOfTime;
	}
	public String getLandingTime() {
		return landingTime;
	}
	public void setLandingTime(String landingTime) {
		this.landingTime = landingTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	

	
}
