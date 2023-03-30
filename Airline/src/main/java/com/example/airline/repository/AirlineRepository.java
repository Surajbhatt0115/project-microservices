package com.example.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.airline.entity.AirlineLoginRegister;

public interface AirlineRepository extends JpaRepository<AirlineLoginRegister, String>{

@Query(value="select * from airlinelogin where email=?1",nativeQuery = true)
public AirlineLoginRegister findUserByEmail(String email);

	
}
