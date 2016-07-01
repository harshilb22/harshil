package com.sapient.service;

import java.util.Comparator;
import java.util.List;

import com.sapient.vo.Emp;

public interface IEmp {
	int addEmployee(Emp emp);

	int removeEmployee(int eid);

	Emp search(int eid);

	List<Emp> viewEmployees();

	List<Emp> viewEmployees(Comparator<Emp> c);

}
