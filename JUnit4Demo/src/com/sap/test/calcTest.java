package com.sap.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.sap.actual.Calculator;

public class calcTest {

	@Test
	public void calcTest1() {
		double expected = 10.0;
		Calculator calc = new Calculator();
		double actual = calc.calcSeries(5, 5, 10);
		assertEquals(expected, actual, 0);
	}

	@Test
	public void calcTest2() {
		double expected = 7.5;
		Calculator calc = new Calculator();
		double actual = calc.calcSeries(5, 5, 5);
		assertEquals(expected, actual, 0);
	}

}
