package com.sapient.client;

import java.util.List;

import com.sapient.dao.Idao;
import com.sapient.exceptions.NotFoundException;
import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class ClientA {

	public static void main(String[] args) {
		Idao dao = EmpUtil.getDaoInstance();
		try {
			List<Emp> lst = dao.viewEmployees("hr");
			for (Emp emp : lst) {
				System.out.println(emp);
			}
		} catch (NotFoundException e) {
			EmpUtil.viewLogger().info(e.getMessage());
		}

	}

}
