package com.sapient.util;

import com.sapient.demos.Student;

public class StuClientB {

	public static void main(String[] args) {
		Student stu = new Student(1001, "ram", 89);
		Student stu2 = new Student(1002, "tom", 89);
		stu = null;
		stu2 = null;
		System.gc();
		System.out.println("line 3");
		System.out.println("line 4");
	}

}
