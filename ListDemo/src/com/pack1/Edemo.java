package com.pack1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Edemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("akbar");
		lst.add("bala");
		lst.add("peter");
		lst.add("ram");
		Enumeration<String> e = Collections.enumeration(lst);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
