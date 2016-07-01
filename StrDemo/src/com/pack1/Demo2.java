package com.pack1;

public class Demo2 {

	public static void main(String[] args) {
		String str = "ram gopal varma";
		StringBuffer buff = new StringBuffer(str);// convert string into string
													// .
		System.out.println(buff);
		buff.append("raj");
		System.out.println(buff);
		buff.insert(4, "atul");
		System.out.println(buff);
		buff.delete(4, 6);
		System.out.println(buff);
	//	buff.reverse();
	//	System.out.println(buff);
		String s2 = buff.substring(1, 4);
		System.out.println(s2);
		buff.replace(4, 6, " ");
		System.out.println(buff);
		buff.replace(16, 19, " ");
		System.out.println(buff);
		buff.replace(3, 4, "");
		System.out.println(buff);
	}

}
