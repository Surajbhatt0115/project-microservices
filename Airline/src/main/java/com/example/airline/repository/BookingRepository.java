package com.example.airline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import com.example.airline.data.BookingFlight;
import com.example.airline.entity.Booking;
import com.example.airline.entity.CompositeKeyforBooking;


public interface BookingRepository extends JpaRepository<Booking,CompositeKeyforBooking >{

	@Query(value="select * from bookingflight",nativeQuery=true)
	public List<Booking> getallDetail();
	
	@Query(value="select * from bookingflight where email=?1",nativeQuery=true)
	public List<Booking> getBookingDetail(String email);
	
	
}
