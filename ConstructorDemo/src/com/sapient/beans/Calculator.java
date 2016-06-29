package com.sapient.beans;

public class Calculator {
	private double d;

	public Calculator(double d) throws Exception {
		super();
		if (d <= 0)
			throw new Exception("value must be greater than 0");
		this.d = d;
	}


	public Calculator(int d) throws Exception {
		this((double)d);
	}

	public double getD() {
		return d;
	}

	public double round2decimal() {
		return Math.round(d * 100) / 100.0;

	}

	public double round2decimal(int n) {
		int p = (int) Math.pow(10, n);
		return Math.round(d * p) / p;
	}

	public int convert2Int() {
		return (int) d;
	}

	public String converttoBin() {
		int val = convert2Int();
		return Integer.toBinaryString(val);
	}

	public String converttoOct() {
		int val = convert2Int();
		return Integer.toOctalString(val);
	}

	public String converttoHex() {
		int val = convert2Int();
		return Integer.toHexString(val);
	}
}