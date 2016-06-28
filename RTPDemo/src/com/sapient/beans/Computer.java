package com.sapient.beans;

public class Computer extends Product {
	private String mboard;

	public Computer(int pid, String pname, double price, String mboard) {
		super(pid, pname, price);
		this.mboard = mboard;
	}

	@Override
	public String isExpensive() {
		if (getPrice() >= 45000)
			return "costlier";
		else
			return "average";
	}

	@Override
	public String display() {

		return super.display() + " " + mboard;
	}

}
