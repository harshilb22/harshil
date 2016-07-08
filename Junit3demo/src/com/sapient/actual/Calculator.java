package com.sapient.actual;

public class Calculator {
	public double calcSeries(int a, int b, int c) {
		double sum = (a + b + c) / 2.0;
		return sum;
	}

	public double Round2Two(double val) {
		double res = Math.round(val * 100) / 100.0;
		return res;
	}
}
