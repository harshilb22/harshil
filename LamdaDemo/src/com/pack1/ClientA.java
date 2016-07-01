package com.pack1;

public class ClientA {

	public static void main(String[] args) {
		ICalc add = (int a, int b) -> {
			return a + b;
		};
		ICalc sub = (int a, int b) -> {
			return a - b;
		};
		ICalc mult = (int a, int b) -> {
			return a * b;
		};
		System.out.println(add.calc(10, 20));
		System.out.println(sub.calc(10, 20));
		System.out.println(mult.calc(10, 20));
	}

}
