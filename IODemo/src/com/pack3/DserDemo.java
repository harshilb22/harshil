package com.pack3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DserDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("mystudent.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stu = null;
		try {
			while (true) {
				stu = (Student) ois.readObject();
				System.out.println(stu);
			}
		} catch (EOFException ex) {
			System.out.println("end of file");
		}
		fis.close();
		ois.close();
	}

}
