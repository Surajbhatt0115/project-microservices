package com.example.airline.entity;

import jakarta.persistence.Column;

//import com.example.airline.data.CompositeKeyforBooking;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass(CompositeKeyforBooking.class)
@Table(name = "bookingflight")
public class Booking {

	@Id
	@Column(name = "flightnumber")
	private String flightnumber;

	@Column(name = "flightname")
	private String flightName;

	@Column(name = "takeoftime")
	private String takeOfTime;

	@Column(name = "landingtime")
	private String landingTime;

	@Column(name = "source")
	private String source;

	@Column(name = "destination")
	private String destination;

	@Id
	@Column(name = "name")
	private String name;
	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "price")
	private int price;

	@Column(name = "dateofbirth")
	private String dateofbirth;

	@Column(name = "address")
	private String address;

	/*-------------------- providing getter and setter for for each instance variable---------------------------*/

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// constructor
	public Booking() {

	}

	public Booking(String flightnumber, String flightName, String takeOfTime, String landingTime, String source,
			String destination, String name, String email, int price, String dateofbirth, String address) {
		super();
		this.flightnumber = flightnumber;
		this.flightName = flightName;
		this.takeOfTime = takeOfTime;
		this.landingTime = landingTime;
		this.source = source;
		this.destination = destination;
		this.name = name;
		this.email = email;
		this.price = price;
		this.dateofbirth = dateofbirth;
		this.address = address;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
