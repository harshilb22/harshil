package com.sapient.client;

import java.util.Scanner;

import com.sapient.bean.Interest;

enum CalcOptions {
	SIMPLE, COMPOUND
}

public class IntClientC {
	public static void main(String[] args) {
		String cont = null;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the amount");
			double amt = scan.nextDouble();
			System.out.println("Enter the years");
			int years = scan.nextInt();
			System.out.println("Enter the rate");
			float rate = scan.nextFloat();
			// String opt = "";
			System.out.println("press simple for simple interest \n compound for compound interest");
			String str = scan.next();
			CalcOptions opt = CalcOptions.valueOf(str.toUpperCase());
			// opt = scan.next();
			Interest obj = new Interest();
			obj.amt = amt;
			obj.rate = rate;
			obj.years = years;
			switch (opt) {
			case SIMPLE:
				System.out.println("simple " + obj.calcSimple());
				break;
			case COMPOUND:
				System.out.println("compound " + obj.calcCompound());
				break;
			default:
				System.out.println("Invalid Option");
			}
			System.out.println("Press y to continue");
			cont = scan.next();
		} while (cont.equals("y"));

	}
}
