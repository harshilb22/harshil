package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("akbar");
		lst.add("bala");
		lst.add("peter");
		lst.add("ram");

		Iterator<String> it = lst.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}

}
