package com.sap.test;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.sap.actual.Calculator;

public class RoundTest {

	private static Calculator calc;

	@BeforeClass
	public static void mybeforeclass() {
		calc = new Calculator();
		System.out.println("before class");
	}

	@AfterClass
	public static void myafterclass() {
		calc = null;
		System.out.println("after class");
	}

	@Before
	public void mybefore() {
		System.out.println("before");
	}

	@After
	public void myafter() {
		System.out.println("after");
	}

	@Test
	public void roundTest1() {
		System.out.println("test1");
		double expected = 10.57;
		double actual = calc.Round2Two(10.567834);
		assertEquals(expected, actual, 0);
	}

	@Test
	public void roundTest2() {
		System.out.println("test2");
		double expected = 10.53;
		double actual = calc.Round2Two(10.532199);
		assertEquals(expected, actual, 0);
	}

	@Test
	public void roundTest3() {
		System.out.println("test3");
		double expected = 10.56;
		double actual = calc.Round2Two(10.555123);
		assertEquals(expected, actual, 0);
	}

	@Ignore
	@Test
	public void roundTest4() {
		System.out.println("test4");
		double expected = 28.0;
		double actual = calc.Round2Two(28);
		assertEquals(expected, actual, 0);
	}
}