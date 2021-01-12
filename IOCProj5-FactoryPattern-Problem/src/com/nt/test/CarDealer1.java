package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;

public class CarDealer1 {
	
	public static void main(String[] args) {
		Car car1=null;
		car1=new LuxoryCar();
		car1.assemble();
		car1.painting();
		car1.roadTest();
	}

}
