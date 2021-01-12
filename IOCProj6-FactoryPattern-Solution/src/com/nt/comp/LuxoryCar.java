package com.nt.comp;

public class LuxoryCar extends Car {

	@Override
	public void assemble() {
		System.out.println("LuxoryCar.assemble()::With prenmium equipment");

	}

	@Override
	public void painting() {
		System.out.println("LuxoryCar.painting():: Imported Paints");

	}

	@Override
	public void roadTest() {
		System.out.println("LuxoryCar.roadTest():: More on Performence and safety");
	}

}
