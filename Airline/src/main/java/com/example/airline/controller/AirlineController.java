package com.example.airline.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airline.entity.AirlineLoginRegister;
import com.example.airline.repository.AirlineRepository;

@RestController
@RequestMapping("/airline")
public class AirlineController {

	@Autowired
	AirlineRepository airlinerepo;

	// for testing request mapping
	@GetMapping("/helo")
	public String helo() {
		return "login";
	}

	// mapping for login for users.
	// if email and password are valid then return true else false
	@PostMapping("/login")
	public String login(@RequestBody AirlineLoginRegister obj) {

		Optional<AirlineLoginRegister> op = airlinerepo.findById(obj.getEmail());

		if (op.isPresent()) {
			AirlineLoginRegister aobj = op.get();

			if (aobj.getEmail().equals(obj.getEmail()) && aobj.getPassword().equals(obj.getPassword())) {
				return "true";
			} else {
				return "false";
			}

		}
		return "false";
	}

	// mapping for signup-> user able to register by providing the credential on
	// success return true else false
	@PostMapping("/signup")
	public String register(@RequestBody AirlineLoginRegister registerobj) {
		String verifyemail = registerobj.getEmail();
		Optional<AirlineLoginRegister> exsistobj = Optional.ofNullable(airlinerepo.findUserByEmail(verifyemail));

		if (exsistobj.isEmpty()) {
			airlinerepo.save(registerobj);
			return "true";
		}

		return "false";
	}

}
