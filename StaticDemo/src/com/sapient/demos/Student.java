package com.sapient.demos;

public class Student {
	private int sid;
	private String sname;
	private int marks;

	public Student(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sid+ " " + sname + " " + marks;
	}

	@Override
	public boolean equals(Object obj) {
		Student stud = (Student)obj;
		if(this.sid == stud.sid && this.sname.equals(stud.sname))
			return true;
		else
			return false;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(sid + "is garbage collected...");
		super.finalize();
	}

}
