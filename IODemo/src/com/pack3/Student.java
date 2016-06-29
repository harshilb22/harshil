package com.pack3;

import java.io.Serializable;

public class Student implements Serializable {
	private int stuId;
	private String stuname;
	private int marks;

	public Student(int stuId, String stuname, int marks) {
		super();
		this.stuId = stuId;
		this.stuname = stuname;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return stuId + " " + stuname + " " + marks;
	}

}
