package com.example.airline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class })
public class AirLineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirLineServiceApplication.class, args);
	}

}
