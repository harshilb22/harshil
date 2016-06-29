package com.sapient.demos;

public class SBlockDemo {
	public static final int MAX;
	static {
		MAX = 10;
		System.out.println("i am in static block" +MAX);
	}

	public static void main(String[] args) {
		System.out.println("main");

	}

}