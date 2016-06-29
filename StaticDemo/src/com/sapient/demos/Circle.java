package com.sapient.demos;

import java.util.Scanner;

import com.sapient.util.MyUtil;

public class Circle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = scan.nextDouble();
		double area = calcArea(radius);
		double peri = calcPeri(radius);
		System.out.println("Area " + MyUtil.round2places(area));
		System.out.println("Perimeter " + MyUtil.round2places(peri));
	}

	public static double calcArea(double rad) {
		double res = Math.PI * rad * rad;
		return res;
	}

	public static double calcPeri(double rad) {
		double res = 2 * Math.PI * rad;
		return res;
	}
}
