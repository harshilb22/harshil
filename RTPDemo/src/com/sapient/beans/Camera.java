package com.sapient.beans;

public class Camera extends Product {
	private String lens;

	public Camera(int pid, String pname, double price, String lens) {
		super(pid, pname, price);
		this.lens = lens;
	}

	@Override
	public String isExpensive() {
		if (getPrice() >= 10000)
			return "expensive";
		else
			return "average";
	}

	@Override
	public String display() {
	
		return super.display() + " " + lens;
	}

}
