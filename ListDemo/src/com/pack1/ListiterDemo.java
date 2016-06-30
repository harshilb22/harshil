package com.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListiterDemo {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("akbar");
		lst.add("bala");
		lst.add("peter");
		lst.add("ram");
		ListIterator<String> it = lst.listIterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);

		}
//itereating using iterator and listiterator
		System.out.println("***************reverse direction");
		while (it.hasPrevious()) {
			String str = it.previous();
			System.out.println(str);

		}
	}
}