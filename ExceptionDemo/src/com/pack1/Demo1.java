/*Exception handling*/



package com.pack1;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("line 1");
		System.out.println("line 2");
		try {
			int d = 9 / 0;
			System.out.println("line 10");
			System.out.println("line 11");
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("line 3");
		System.out.println("line 4");
		System.out.println("line 5");
	}
}
