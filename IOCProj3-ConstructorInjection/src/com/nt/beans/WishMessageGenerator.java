package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date  date;
	
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constrctor");
	}
	

	public void setDate1(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date = date;
	}

	public  WishMessageGenerator(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator::1-param constructor");
		this.date=date;
	}
	
	//b.method
	public String generateWishMessage(String user) {
		System.out.println("date=="+date);
		int hour=0;
		//get current hour of the day
		hour=date.getHours();
		//generate Wish Message
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good AfterNoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
	}

}
