package com.example.flight.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;

//import com.example.airline.entity.AirlineLoginRegister;
import com.example.flight.entity.Flight;
import com.example.flight.repository.FlightRepository;
//import com.example.flight.responsetemplate.Booking;
//import com.example.flight.responsetemplate.ResponseTemplateVo;
import com.example.flight.responsetemplate.Booking;
import com.example.flight.responsetemplate.ResponseTemplateVo;


@RestController
@RequestMapping(value="/flight")

public class FlightController {

	@Autowired
 private FlightRepository flightRepository;
	

//testing	
	@GetMapping("/fl")
	public String ge() {
		return "df";
	}
	
		@GetMapping("/getflightdetail")
		public List<Flight> getFlightDetail(){
			List<Flight> fd= flightRepository.getallDetail();
			return fd;		
		}
		
		@PostMapping("/searchflight")
		public List<Flight> searchFlight(@RequestBody Flight flight){
			
			
			String source=flight.getSource();
			String destination=flight.getDestination();
	Optional<List<Flight>> flightdetail=	Optional.ofNullable(flightRepository.getflightdetail(source,destination));

	if(flightdetail.isPresent()) {
		List<Flight>  object=flightdetail.get();
		return object;
	}
		
	List<Flight> emptylist=null;
	return emptylist;		
			
			
		}
				

//		@Autowired 
//		private RestTemplate restTemplate;
//
//		@GetMapping(value="/{email}",consumes = "application/json")
//		public ResponseTemplateVo getBookingDetailWithEmail(@PathVariable ("email") String email) {
//			ResponseTemplateVo vo=new ResponseTemplateVo();
//			
//		Booking booking= restTemplate.getForObject("http://localhost:9001/booking/getbookingdetail/"+email,Booking.class);
//		
//		vo.setBooking(booking);
//			return vo;
//		}

		
}
