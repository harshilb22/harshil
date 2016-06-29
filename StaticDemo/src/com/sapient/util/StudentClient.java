package com.sapient.util;

import com.sapient.demos.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student stu = new Student(1001, "ram", 89);
		Student stu2 = new Student(1001, "ram", 89);
		System.out.println(stu);
		System.out.println(stu2);
		System.out.println(stu.equals(stu2));
	}

}
