package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class CarDealer2 {

	public static void main(String[] args) {
		Car car1=null;
		//get Car object
		car1=CarFactory.getInstance("sports");

	}

}
