package com.sapient.dao;

public interface Queries {
	String viewAll = "select * from employees";
	String viewbydept = "select * from employees where emp_dept=?";
	String viewbyid = "select * from employees where emp_id = ?";
	String addemp = "INSERT into employees Values(?,?,?,?,?)";
}
