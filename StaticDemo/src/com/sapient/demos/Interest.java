package com.sapient.demos;

import java.util.Scanner;

import com.sapient.util.MyUtil;

public class Interest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amt = scan.nextDouble();
		System.out.println("Enter the years");
		int years = scan.nextInt();
		System.out.println("Enter the rate");
		float rate = scan.nextFloat();
		double si = calcSimple(amt, years, rate);
		double ci = calcCompound(amt, years, rate);
		System.out.println("The compound interest is " + MyUtil.round2places(ci));
		System.out.println("The simple interest is " + MyUtil.round2places(si));
	}

	public static double calcSimple(double amt, int years, float rate) {
		return amt * years * rate / 100;
	}

	public static double calcCompound(double amt, int years, float rate) {
		return amt * Math.pow((1 + rate / 100.0), years) - amt;
	}
}
