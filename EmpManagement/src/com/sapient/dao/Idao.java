package com.sapient.dao;

import java.util.List;

import com.sapient.exceptions.IdException;
import com.sapient.exceptions.NotFoundException;
import com.sapient.vo.Emp;

public interface Idao {

	int addEmployee(Emp emp) throws IdException;

	int updateEmployee(int eid, double sal) throws NotFoundException;

	int removeEmployee(int eid) throws NotFoundException;

	List<Emp> viewEmployees() throws NotFoundException;

	Emp viewEmployees(int eid) throws NotFoundException;

	List<Emp> viewEmployees(String dept) throws NotFoundException;
}
