package com.example.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

import com.example.flight.entity.Flight;
import com.example.flight.repository.FlightRepository;
//import com.example.flight.responsetemplate.Booking;
//import com.example.flight.responsetemplate.ResponseTemplateVo;

@RestController
@RequestMapping("/flight")

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

		
//
//		@Autowired 
//		private RestTemplate restTemplate;
//
//		@GetMapping("/{email}")
//		public ResponseTemplateVo getBookingDetailWithEmail(@PathVariable ("email") String email) {
//			ResponseTemplateVo vo=new ResponseTemplateVo();
//			
//		Booking booking= restTemplate.getForObject("http://localhost:9001/booking/getbookingdetail/"+email,Booking.class);
//		
//		vo.setBooking(booking);
//		
//			
//			
//			return vo;
//		}
		
		
	
}
