package com.pack3;

/*Serialization*/
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("mystudent.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student stu = new Student(1001, "ram", 90);
		Student stu1 = new Student(1002, "sam", 100);
		Student stu2 = new Student(1003, "tom", 60);
		oos.writeObject(stu);
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.close();
		fos.close();
		System.out.println("serialized");
	}

}
