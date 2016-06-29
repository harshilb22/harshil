/*closing stream finallty block
 * also using new file instead of system.in 
 * so that we dont have to close system.in*/

package com.pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println(display());
		show();
	}

	public static int display() {
		Scanner scan = null;
		try {
			scan = new Scanner(new File("abc.txt"));
			int a = scan.nextInt();
			int b = scan.nextInt();
			int res = a + b;
			return res;
		} catch (InputMismatchException ex) {
			System.out.println(ex.getMessage());
			return 0;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return 0;
		} finally {
			if(scan != null)
			System.out.println("i am in finally block");
			if(scan != null)
			scan.close();
		}
	}

	public static void show() {
		System.out.println("show method called");
	}
}
