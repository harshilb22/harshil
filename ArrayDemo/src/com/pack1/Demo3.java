package com.pack1;

public class Demo3 {
	public static void main(String[] args) {
		String[] arr = { "ram", "anand", "bal", "abc" };
	String[] arr2 = new String[arr.length];
	System.arraycopy(arr, 0, arr2, 0, arr.length);
	for(String str : arr2){
		System.out.println(str);
	}
	}
}
