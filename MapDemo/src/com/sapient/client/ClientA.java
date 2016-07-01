package com.sapient.client;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.sapient.service.IEmp;
import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;
import com.sapient.vo.SalComparator;

public class ClientA {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String opt = null;
		int menu = 0;
		IEmp ser = null;
		List<Emp> lst = null;
		do {
			System.out.println("1--add \n 2--search\n 3--remove \n 4--view \n 5--sortbysal \n");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				addEmployee();
				break;
			case 2:
				doSearch();
				break;

			case 3:
				remove();
				break;

			case 4:
				ser = EmpUtil.getService();
				lst = ser.viewEmployees();
				viewAll(lst);
				break;
			case 5:
				ser = EmpUtil.getService();
				lst = ser.viewEmployees(new SalComparator());
				viewAll(lst);
				break;
			}
			System.out.println("press y to continue");
			opt = scan.next();
		} while (opt.equals("y"));
	}

	private static void addEmployee() {
		System.out.println("enter employee Id");
		int eid = scan.nextInt();
		System.out.println("enter employee name");
		String name = scan.next();
		System.out.println("enter employee Salary");
		double Sal = scan.nextDouble();
		Emp emp = new Emp(eid, name, Sal);
		IEmp ser = EmpUtil.getService();
		int res = ser.addEmployee(emp);
		if (res == 1)
			System.out.println("employee added");
		else
			System.out.println("employee not added");
	}

	public static void viewAll(List<Emp> lst) {
		for (Emp emp : lst) {
			System.out.println(emp);
		}
	}

	private static void doSearch() {
		System.out.println("enter em ID");
		int eid = scan.nextInt();
		IEmp ser = EmpUtil.getService();
		Emp emp = ser.search(eid);
		if (emp != null)
			System.out.println(emp);
		else
			System.out.println("not found");
	}

	private static void remove() {
		System.out.println("enter the employee id which is to be removed");
		int eid = scan.nextInt();
		IEmp ser = EmpUtil.getService();
		int lst = ser.removeEmployee(eid);

	}
}
