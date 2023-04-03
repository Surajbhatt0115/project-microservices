package com.example.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.flight.entity.Flight;

public interface FlightRepository  extends JpaRepository<Flight, String>{
	@Query(value="select * from flightdetail",nativeQuery=true)
	public List<Flight> getallDetail();

	
	@Query(value="select * from flightdetail where source=?1 AND destination=?2",nativeQuery=true)
	public List<Flight> getflightdetail(String source, String destination);
}
