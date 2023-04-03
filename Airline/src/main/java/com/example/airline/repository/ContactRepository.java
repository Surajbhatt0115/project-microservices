package com.example.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airline.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,String> {

}
