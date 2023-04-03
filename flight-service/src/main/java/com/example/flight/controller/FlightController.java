package com.example.flight.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight.entity.Flight;
import com.example.flight.repository.FlightRepository;


@RestController
@RequestMapping(value = "/flight")

public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	// testing
	@GetMapping("/fl")
	public String ge() {
		return "df";
	}

	// returning list of flight details.
	@GetMapping("/getflightdetail")
	public List<Flight> getFlightDetail() {
		List<Flight> fd = flightRepository.getallDetail();
		return fd;
	}

	// search flight based on source and destination and return available flights.
	@PostMapping("/searchflight")
	public List<Flight> searchFlight(@RequestBody Flight flight) {

		String source = flight.getSource();
		String destination = flight.getDestination();
		// for handling if null object is return.
		Optional<List<Flight>> flightdetail = Optional
				.ofNullable(flightRepository.getflightdetail(source, destination));
		if (flightdetail.isPresent()) {
			List<Flight> object = flightdetail.get();
			return object;
		}

		List<Flight> emptylist = null;
		return emptylist;

	}

}
