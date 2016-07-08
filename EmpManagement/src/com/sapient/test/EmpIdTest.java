package com.sapient.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.dao.EmpDaoImpl;
import com.sapient.exceptions.NotFoundException;
import com.sapient.vo.Emp;

public class EmpIdTest {
	private static EmpDaoImpl dao;
	private static SimpleDateFormat sdf;
	private Emp e1, e2;
	private List<Emp> expected;

	@BeforeClass
	public static void beforeclass() {
		dao = new EmpDaoImpl();
		sdf = new SimpleDateFormat("dd-MMM-yyyy");
	}

	@AfterClass
	public static void afterclass() {
		dao = null;
	}

	@Before
	public void setup() throws ParseException {
		e1 = new Emp(121754, "Kartik Tripathi", 0, "hr", sdf.parse("13-JUN-2016"));
		e2 = new Emp(121734, "Nikunj Agrawal", 5000, "hr", sdf.parse("13-JUN-2017"));
		expected = new ArrayList<Emp>();
		expected.add(e2);
		expected.add(e1);
	}

	@Test
	public void viewIdtest1() throws NotFoundException {
		Emp actual = dao.viewEmployees(121754);
		assertEquals(e1, actual);
	}

	@Test
	public void viewIdtest2() throws NotFoundException {
		Emp actual = dao.viewEmployees(121734);
		assertNotNull(actual);

	}

	@Test(expected = NotFoundException.class)
	public void viewIdtest3() throws NotFoundException {
		Emp actual = dao.viewEmployees(1008);
	}

	@Test
	public void viewIdtest4() throws NotFoundException {
		List<Emp> lst = dao.viewEmployees("tr");
		assertTrue(lst.size() == 4);
	}

	@Test
	public void viewIdtest5() throws NotFoundException {
		List<Emp> actual = dao.viewEmployees("hr");
		assertEquals(actual, expected);
	}

	@Test(expected = NotFoundException.class)
	public void viewIdtest6() throws NotFoundException {
		List<Emp> actual = dao.viewEmployees("fr");
		// assertEquals(actual, expected);
	}
}
