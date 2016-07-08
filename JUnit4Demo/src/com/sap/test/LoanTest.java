package com.sap.test;

import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.actual.AgeException;
import com.sap.actual.IncomeException;
import com.sap.actual.LoanService;

public class LoanTest {
	private static LoanService ser;

	@BeforeClass
	public static void mybeforeclass() {
		ser = new LoanService();

	}

	@AfterClass
	public static void myafterclass() {
		ser = null;
	}

	@Test
	public void loanTest1() throws AgeException, IncomeException {
		boolean actual = ser.approveLoan(22, 450000);
		assertTrue(actual);
	}

	@Test
	public void loanTest2() throws AgeException, IncomeException {
		boolean actual = ser.approveLoan(40, 600000);
		assertTrue(actual);
	}

	@Test
	public void loanTest3() throws AgeException, IncomeException {
		boolean actual = ser.approveLoan(20, 400000);
		assertTrue(actual);
	}

	@Test(expected = IncomeException.class)
	public void loanTest4() throws AgeException, IncomeException {
		boolean actual = ser.approveLoan(27, 300000);
		assertTrue(actual);
	}

	@Test(expected = AgeException.class)
	public void loanTest5() throws AgeException, IncomeException {
		boolean actual = ser.approveLoan(19, 600000);
		assertTrue(actual);
	}
}
