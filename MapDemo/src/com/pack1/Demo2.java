package com.pack1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo2 {
	private static Map<Integer, String> emap;
	static {
		emap = new HashMap<Integer, String>();
		emap.put(1001, "ram");
		emap.put(1006, "sam");
		emap.put(1005, "qam");
		emap.put(1003, "rom");

	}

	public static void main(String[] args) {
		// -----------------------------iterting using
		// keySet()-------------
		Set<Integer> set = emap.keySet();
		for (int key : set) {
			System.out.println(emap.get(key));

		}
		System.out.println("--------iteretion in the second way-----------");
		// using values()
		Collection<String> col = emap.values();
		for (String str : col) {
			System.out.println(str);
		}
		System.out.println("--------iteretion in the third way-----------");
		// using entrySet()
		Set<Entry<Integer, String>> entries = emap.entrySet();
		for (Entry e : entries) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
