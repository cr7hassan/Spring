package com.nt.factory;

import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportsCar;
import com.nt.comp.StandardCar;

public class CarFactory {
	
	//factory method implementing factory pattern
	public  static Car getInstance(String type) {
		Car car=null;
		if(type.equalsIgnoreCase("standard")) {
			car=new StandardCar();
		}
		else if(type.equalsIgnoreCase("luxory")) {
			car=new LuxoryCar();
		}
		else if(type.equalsIgnoreCase("sports")) {
			car=new SportsCar();
		}
		else {
		   throw new IllegalArgumentException("Invalid CarType");	
		}
		//invoke methods
		car.assemble();
		car.painting();
		car.roadTest();
		return car;
	}//method

}
