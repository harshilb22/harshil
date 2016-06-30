package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("akbar");
		lst.add("bala");
		lst.add("peter");
		lst.add("ram");

		Collections.sort(lst);
		for (String str : lst) { // going only for string refrence as each item
									// is only string
			System.out.println(str); // typecasting is not required

		}
	}

}
