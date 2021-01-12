package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Value("car")
	private String vehicleType; 
	
	@Autowired
	private Engine engine;
	
	public void journey(String start,String end) {
		System.out.println("Journe starts from "+start);
		engine.start();
		System.out.println("journe is going on");
		engine.end();
		System.out.println(" and Journey ends at "+end);
	}
}
