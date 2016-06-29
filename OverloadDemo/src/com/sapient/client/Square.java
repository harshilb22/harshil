package com.sapient.client;

public class Square {

	public static int calcArea(int side) {
		return side * side;
	}
	public static double calcArea(double side) {
		return side * side;
	}
	public static void main(String[] args) {
		System.out.println(calcArea(5.2));

	}

}
