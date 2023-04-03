package com.example.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airline.entity.Booking;
//import com.example.airline.data.BookingFlight;
import com.example.airline.repository.BookingRepository;


//@CrossOrigin(value="http://localhost:4200")
@RestController
@RequestMapping("/booking")
public class BookingController {

	
	@Autowired
	BookingRepository bookingRepository;
	
	
// For testing In POSTMAN pass this as a RequestBody
	
	/*"flightnumber":"ind123",
	    "flightname":"indigio",
	 "takeofTime":"12:00",
	   "landingtime":"14:00",
	   "source":"delhi",
	 "destination":"karnataka",
	 "name":"amit",
	 "email":"xyz@123@gmail.com",
	 "price":"4000"  
	}*/
	
	// booking ticket  but checking composite key (name ,flightNumber,email)
	// so one user cannot book multiple ticket for himself.
	@PostMapping("/bookingticket")
	public String bookingFlightTicket(@RequestBody Booking bflight) {
		
		bookingRepository.save(bflight);
		
	return"booked success";
	}

	// using this map we are retriving detail of flight to show it to user..
	@GetMapping("/getbookingdetail")
	public List<Booking> getDetail(){
	List<Booking> bookinglist=bookingRepository.getallDetail();
		return bookinglist;	
	}

}
