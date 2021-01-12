package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportsCar;
import com.nt.comp.StandardCar;

public class CarDealer3 {
	
	public static void main(String[] args) {
		Car car1=null;
		car1=new SportsCar();
		car1.assemble();
		car1.painting();
		car1.roadTest();
	}

}
