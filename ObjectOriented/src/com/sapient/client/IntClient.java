package com.sapient.client;

import java.util.Scanner;

import com.sapient.bean.Interest;

public class IntClient {

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
			int opt = 0;

			System.out.println("press 1 for simple interest \n 2 for compound interest");
			opt = scan.nextInt();
			Interest obj = new Interest();
			obj.amt = amt;
			obj.rate = rate;
			obj.years = years;

			switch (opt) {
			case 1:
				System.out.println("simple " + obj.calcSimple());
				break;
			case 2:
				System.out.println("compound " + obj.calcCompound());
				break;
			default:
				System.err.println("Invalid Option");
			}
			System.out.println("Press y to continue");
			cont = scan.next();
		} while (cont.equals("y"));

	}
}
