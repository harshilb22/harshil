package com.sapient.beans;

public class Emp {
	private int age;
	private String name;
	private String compname = "Sapient Nitro";

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age >= 20 && age <= 55)
			this.age = (byte)age;
		else
			throw new Exception("age must be between 20 and 55");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name.matches("[A-Za-z]{3,15}"))
				this.name = name;
		else 
			throw new Exception("Name must be between 3 and 15 alphabets");
	}

	public String getCompname() {
		return compname;
	}

}
