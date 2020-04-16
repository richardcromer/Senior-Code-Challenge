package com.mindex.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;



@SpringBootApplication
public class ChallengeApplication {

	/* 
	 * Richard Cromer Added to support serialization and deserialization of date/time module.
	 */
	@Autowired
	private ObjectMapper objectMapper;
	
	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}
	
	  @PostConstruct
	  public void setUp() {
	    objectMapper.registerModule(new JavaTimeModule());
	  }
}
