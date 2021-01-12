package com.nt.comp;

public class LuxoryCar extends Car {

	@Override
	public void assemble() {
		System.out.println("StandardCar.assemble()::With prenmium equipment");

	}

	@Override
	public void painting() {
		System.out.println("StandardCar.painting():: Imported Paints");

	}

	@Override
	public void roadTest() {
		System.out.println("StandardCar.roadTest():: More on Performence and safety");
	}

}
