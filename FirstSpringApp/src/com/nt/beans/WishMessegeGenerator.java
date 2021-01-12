package com.nt.beans;

import java.util.Date;

public class WishMessegeGenerator {
	private Date date;
	public void setDate(Date date) {
		this.date=date;
	}
	//business method logic
	public String generateWishMessege(String name) {
		int hour=0;
		//get current hour
		hour=date.getHours();
		if(hour<=12)
			return "GM"+name;
		else if(hour<=16)
			return "GA"+name;
		else if(hour<=20)
			return "GE"+name;
		else
			return "GN8"+name;
	}
}
