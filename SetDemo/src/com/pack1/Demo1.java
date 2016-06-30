package com.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("ram");
		set.add("ram");// duplicates ignored
		set.add("rom");
		set.add("tom");
		set.add("rat");
		for (String str : set) {
			System.out.println(str);
		}
	}

}