package com.sapient.demos;

public class SalesClient {
public static void main(String[] args){
	sales s1 = new sales("ram", 15000);
	sales s2 = new sales("tom", 25000);
	sales s3 = new sales("sam", 35000);
	System.out.println(sales.TOT_SALES);
}
}
