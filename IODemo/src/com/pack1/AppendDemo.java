package com.pack1;
/*appending text in file*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("sap\\first.txt", true);
		BufferedWriter bw = new BufferedWriter(fw, 10 * 1024);
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the text");
		String str = scan.nextLine();
		bw.write("\n" + str + "\n");
		bw.close();
		fw.close();
		System.out.println("file appended");
	}
}
