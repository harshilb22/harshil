package com.pack1;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		String[] arr = { "ram", "anand", "bal", "abc" };

		Arrays.sort(arr);
		for (String str : arr) {
			System.out.println(str);
		}
	}
}