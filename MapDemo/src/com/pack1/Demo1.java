package com.pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo1 {
	private static Map<Integer, String> emap;
	static {
		emap = new TreeMap<Integer, String>();
		emap.put(1001, "ram");
		emap.put(1005, "sam");
		emap.put(1005, "qam");
		emap.put(1003, "rom");

	}

	// calling the values by key
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter eid");
		int eid = scan.nextInt();
		String str = emap.get(eid);
		if (str != null)
			System.out.println(str);
		else
			System.out.println("not found");

	}

}
