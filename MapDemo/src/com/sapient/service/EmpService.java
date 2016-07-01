package com.sapient.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.vo.Emp;

public class EmpService implements IEmp {
	private static Map<Integer, Emp> emap;
	static {
		emap = new HashMap<Integer, Emp>();
		emap.put(1007, new Emp(1007, "ram", 9000));
		emap.put(1002, new Emp(1002, "tom", 9000));
		emap.put(1005, new Emp(1005, "sam", 17000));
	}

	@Override
	public int addEmployee(Emp emp) {
		emap.put(emp.getEid(), emp);
		return 1;
	}

	@Override
	public Emp search(int eid) {
		Emp emp = emap.get(eid);
		return emp;
	}

	@Override
	public List<Emp> viewEmployees() {
		List<Emp> lst = getList();
		Collections.sort(lst);
		return lst;
	}

	@Override
	public List<Emp> viewEmployees(Comparator<Emp> c) {
		List<Emp> lst = getList();
		Collections.sort(lst, c);
		return lst;
	}

	public List<Emp> getList() {

		List<Emp> lst = new ArrayList<Emp>();
		Collection<Emp> col = emap.values();
		lst.addAll(col);
		return lst;
	}

	@Override
	public int removeEmployee(int eid) {
		if (emap.containsKey(eid)) {
			emap.remove(eid);
			return 1;
		} else {
			return 0;
		}

	}

}