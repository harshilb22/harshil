package com.sapient.beans;

public class Car {
	private int carId;
	private String carname;
	private double price;

	public Car(int carId) {
		super();
		this.carId = carId;
		System.out.println("one arg called");
	}

	public Car(int carId, String carname) {
		this(carId);
		this.carname = carname;
		System.out.println("two arg con called");
	}

	public Car(int carId, String carname, double price) {
		this(carId, carname);
		this.price = price;
		System.out.println("three arg con called");
	}

	public void display() {
		System.out.println(carId + " " + carname + "  " + price);
	}
}
