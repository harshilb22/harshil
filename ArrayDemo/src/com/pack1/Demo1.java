package com.pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the name");
			arr[i] = scan.nextInt();
		}

	
		
		
		Arrays.sort(arr);
		for (int val : arr) {
			System.out.println(val);
		}
	}
}
