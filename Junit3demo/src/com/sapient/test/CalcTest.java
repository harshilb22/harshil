package com.sapient.test;

import com.sapient.actual.Calculator;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		System.out.println("before");
	}

	@Override
	protected void tearDown() throws Exception {
		System.out.println("after");
	}

	public void testCalc1() {
		double expected = 10.0;
		Calculator calc = new Calculator();
		double actual = calc.calcSeries(5, 5, 10);
		assertEquals(expected, actual);
	}

	public void testCalc2() {
		double expected = 7.5;
		Calculator calc = new Calculator();
		double actual = calc.calcSeries(5, 5, 5);
		assertEquals(expected, actual);
	}
}
