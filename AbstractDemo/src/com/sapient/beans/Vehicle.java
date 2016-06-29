package com.sapient.beans;

public abstract class Vehicle {
	private int vehId;
	private String vehName;

	public Vehicle(int vehId, String vehName) {
		super();
		this.vehId = vehId;
		this.vehName = vehName;
	}

	public String display() {
		return vehName;
	}
	
	public abstract void drive();
}
