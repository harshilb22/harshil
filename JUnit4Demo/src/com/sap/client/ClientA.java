package com.sap.client;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.sap.test.LoanTest;

//running the junit code from command line
public class ClientA {
	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(LoanTest.class);// launches the test
															// runner
		System.out.println(res.getFailureCount());
		List<Failure> flrs = res.getFailures();
		for (Failure f : flrs) {
			System.out.println(f.toString());
		}
		System.out.println("success" + res.wasSuccessful());
	}
}
