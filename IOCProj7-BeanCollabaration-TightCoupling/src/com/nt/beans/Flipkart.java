package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private DTDC dtdc;
	
	public Flipkart() {
	  System.out.println("Flipkart:: 0-param constructor");
	}

	public void setDtdc(DTDC dtdc) {
		System.out.println("Flipkart.setDtdc(-)");
		this.dtdc = dtdc;
	}
	
	public String shopping(String items[],float prices[]) {
		float billAmt=0.0f;
		Random rad=null;
		int orderId=0;
		String status=null;
		//generate billAmt
		for(float p:prices) {
			billAmt=billAmt+p;
		}
		//generated order id
		rad=new Random();
		orderId=rad.nextInt(100000);
		//deliver product
		status=dtdc.deliver(orderId);
		return Arrays.toString(items)+" with prices"+Arrays.toString(prices)+" having bill Amt::"+billAmt+"--> "+status;
		
	}

	
}
