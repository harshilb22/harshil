package com.pack2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClientA {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1001, "ram", 90000));
		lst.add(new Emp(1531, "tom", 20));
		lst.add(new Emp(1111, "shyam", 110000));
		lst.add(new Emp(1541, "sam", 9000));
		lst.add(new Emp(1131, "ben", 900));
		lst.add(new Emp(1021, "kai", 2000));

		Collections.sort(lst);
		for (Emp emp : lst) {
			System.out.println(emp);
		}
		System.out.println("****sort by name******");
		Collections.sort(lst, new NameComparator());
		for (Emp emp : lst) {
			System.out.println(emp);
		}
		System.out.println("****sort by salary******");
		Collections.sort(lst, new SalComparator());
		//Collections.reverse(lst);
		for (Emp emp : lst) {
			System.out.println(emp);
		}
	}

}
