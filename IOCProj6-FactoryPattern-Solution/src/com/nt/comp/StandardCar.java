package com.nt.comp;

public class StandardCar extends Car {

	@Override
	public void assemble() {
		System.out.println("StandardCar.assemble()::With Economy equipment");

	}

	@Override
	public void painting() {
		System.out.println("StandardCar.painting():: Asain Paints");

	}

	@Override
	public void roadTest() {
		System.out.println("StandardCar.roadTest():: More on Performence,Milege,Less on safety");
	}

}
