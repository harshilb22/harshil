package com.sapient.client;

import java.util.Scanner;

import com.sapient.beans.Interest;

public class IntClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amt = scan.nextDouble();
		System.out.println("Enter the years");
		int years = scan.nextInt();
		System.out.println("Enter the rate");
		float rate = scan.nextFloat();

		Interest obj;
		try {
			obj = new Interest(amt, years, rate);
			System.out.println("simple" + obj.calcSimple());
			System.out.println("compound" + obj.calcCompound());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
