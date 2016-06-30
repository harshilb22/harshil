package com.pack1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Demo3 {

	public static void main(String[] args) {
		List<String> lst = new LinkedList<String>();
		lst.add("ram");
		lst.add("akbar");
		lst.add("bala");
		lst.add("peter");
		lst.add("ram");
		System.out.println(lst);
		lst.add(2, "gopal");// adding at particular index
		System.out.println(lst);
		lst.remove(4);// removing at particular index
		System.out.println(lst);
		lst.remove("ram");// adding at particular index
		System.out.println(lst);
		System.out.println("size" + " " + lst.size());// determining size
		System.out.println(lst.get(2));// getting element at a particular
										// element

		List<String> lst2 = new ArrayList<String>();
		lst2.addAll(lst);
		System.out.println(lst2);
	}

}
