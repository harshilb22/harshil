package com.pack2;

import java.util.HashSet;
import java.util.Set;

public class ClientA {

	public static void main(String[] args) {
		Set<Emp> set = new HashSet<Emp>();
		Emp e1 = new Emp(1001, "ram", 9000);
		Emp e2 = new Emp(1005, "tom", 0);
		Emp e3 = new Emp(1005, "tom", 00000);
		Emp e4 = new Emp(1004, "sam", 958450);
		Emp e5 = new Emp(1005, "dam", 9000456);
		set.add(e5);
		set.add(e4);
		set.add(e3);
		set.add(e2);// ignored on the basis of equals and hashcode()
		set.add(e5);// ignored based on refrence
		set.add(e1);
		for (Emp emp : set) {
			System.out.println(emp);
		}
	}

}
