package com.sapient.demos;

public class CmdDemo {

	public static void main(String[] args) {
		int val1 = Integer.parseInt(args[0]);
		double val2 = Double.parseDouble(args[1]);
		double sum = val1 +val2;
		System.out.println("sum of 2 nos = " + sum);
	}

}