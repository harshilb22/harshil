package com.sapient.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class is a VO object binds a row from employee table
 * 
 * @author hbharg
 * @version 1.0
 *
 */
public class Emp implements Comparable<Emp> {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
	private int empId;
	private String empName;
	private double empSal;
	private String dept;
	private Date doj;

	public Emp() {

	}

	/* Creating getters and setters for all the variables */
	/**
	 * 
	 * @return returns employee ID
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * this method sets the employee ID to the instance
	 * 
	 * @param empId
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * 
	 * @return gets employee name
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * this method sets employee name
	 * 
	 * @param empName
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * 
	 * @return employee salary
	 */
	public double getEmpSal() {
		return empSal;
	}

	/**
	 * this method sets employee salary
	 * 
	 * @param empSal
	 */
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	/**
	 * 
	 * @return employee department
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * this method sets the department
	 * 
	 * @param dept
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * 
	 * @return gets the java.util.Date
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * this method sets java.util.Date
	 * 
	 * @param doj
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/* overriding to string AND equals and hash set */
	/**
	 * it is overridden and displays employee fields
	 */
	@Override
	public String toString() {
		return empId + " " + empName + " " + empSal + " " + dept + " " + sdf.format(doj);
	}

	/**
	 * it is overridden to check the object based on values and also to
	 * eliminate duplicates for hash collection
	 */
	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp) obj;
		if (this.empId == emp.empId && this.empName.equals(emp.empName) && this.empSal == emp.empSal
				&& this.dept.equals(emp.dept) && this.doj.compareTo(emp.doj) == 0)
			return true;
		else
			return false;
	}

	/**
	 * it is overridden to eliminate the duplicate for hash collection employee
	 * id is the hash code
	 */
	@Override
	public int hashCode() {

		return empId;
	}

	/**
	 * this method is implemented to sort based on empId
	 */
	/* adding comparable */
	@Override
	public int compareTo(Emp emp) {
		if (this.empId > emp.empId)
			return 1;
		else if (this.empId < emp.empId)
			return -1;
		else
			return 0;
	}

	public Emp(int empId, String empName, double empSal, String dept, Date doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.dept = dept;
		this.doj = doj;
	}

}
