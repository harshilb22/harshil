package com.sapient.beans;

public abstract class Product {
	private int pid;
	private String pname;
	private double price;

	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public int getId() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}

	public String display() {
		return pid + " " + pname + " " + price + " ";
	}

	public abstract String isExpensive();
}
