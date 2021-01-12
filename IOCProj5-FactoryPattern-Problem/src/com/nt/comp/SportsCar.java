package com.nt.comp;

public class SportsCar extends Car {

	@Override
	public void assemble() {
		System.out.println("StandardCar.assemble()::With prenmium equipment and Sporty look");

	}

	@Override
	public void painting() {
		System.out.println("StandardCar.painting():: Imported Paints with Vibrant Colors");

	}

	@Override
	public void roadTest() {
		System.out.println("StandardCar.roadTest():: More on Performence,Speed and safety");
	}

}
