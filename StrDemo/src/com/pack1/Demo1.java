package com.pack1;

public class Demo1 {
	public static void main(String[] args) {
		String str = "ram gopal varma";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.indexOf("p"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.charAt(4));
		System.out.println(str.substring(4, 9));
		System.out.println(str.matches("[A-Za-z ]+"));
		System.out.println(str.replace('a', 'b'));
		System.out.println(str);
	}
}
