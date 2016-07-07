package com.sapient.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sapient.dao.Idao;
import com.sapient.exceptions.IdException;
import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class ClientC {

	public static void main(String[] args) throws ParseException {
		Emp emp = new Emp();
		emp.setEmpId(10010);
		emp.setEmpName("Katrikeya");
		emp.setEmpSal(10000);
		emp.setDept("tr");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Date dt = sdf.parse("07-JUL-2016");
		emp.setDoj(dt);
		Idao dao = EmpUtil.getDaoInstance();
		try {
			int res = dao.addEmployee(emp);
			EmpUtil.viewLogger().info("row added");
		} catch (IdException e) {

			EmpUtil.viewLogger().info(e.getMessage());
		}
	}

}
