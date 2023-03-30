package com.example.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.flight.entity.Flight;

public interface FlightRepository  extends JpaRepository<Flight, String>{
	@Query(value="select * from flightdetail",nativeQuery=true)
	public List<Flight> getallDetail();
}
