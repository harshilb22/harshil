package com.sapient.util;

import com.sapient.service.EmpService;
import com.sapient.service.IEmp;

public class EmpUtil {
	private static IEmp eser = new EmpService();

	public static IEmp getService() {
		return eser;
	}
}
