/*This code illustrates auto matic closing*/



package com.pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo5 {

	public static void main(String[] args) {
		System.out.println(readData());
	}

	public static int readData() {
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {

			System.out.println(br.readLine());
			return 1;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return 0;
	}

}
