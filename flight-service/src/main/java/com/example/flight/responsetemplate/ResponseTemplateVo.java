package com.example.flight.responsetemplate;

public class ResponseTemplateVo {

	private Booking booking;

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public ResponseTemplateVo() {}
	
	public ResponseTemplateVo(Booking booking) {
		
		this.booking = booking;
	}
	
	
}
