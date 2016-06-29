package com.sapient.client;

import java.util.Scanner;

import com.sapient.beans.Factorial;

public class factClient {

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			obj.setNum(scan.nextInt());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Factorial of given number is " + obj.findFact());
	}

} 
