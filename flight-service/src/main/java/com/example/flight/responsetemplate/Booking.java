package com.example.flight.responsetemplate;


public class Booking {
	private String flightnumber;
	private String flightName;
	
	private String  takeOfTime;
	
	private String  landingTime;
	
	
	private String source;
	
	
	
	public Booking(){
		
	}
	
	public Booking(String flightnumber, String flightName, String takeOfTime, String landingTime, String source,
			String destination, String name, String email, int price) {
				this.flightnumber = flightnumber;
		this.flightName = flightName;
		this.takeOfTime = takeOfTime;
		this.landingTime = landingTime;
		this.source = source;
		this.destination = destination;
		this.name = name;
		this.email = email;
		this.price = price;
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

	private String destination;

	private String name;
	private String email;
	
	private int price;
	
	
	
}
