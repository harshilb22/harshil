package com.sapient.beans;

public class Car extends Vehicle {

	public Car(int vehId, String vehName) {
		super(vehId, vehName);
	}

	@Override
	public void drive() {
		System.out.println("car drive");

	}

}
