package com.sapient.demos;

public class sales {
	private String name;
	private double sales;
	public static double TOT_SALES;
	public sales(String name, double sales) {
		super();
		this.name = name;
		this.sales = sales;
		TOT_SALES = TOT_SALES + this.sales;
	}

}
