package com.sapient.util;

public class MyUtil {
	public static double round2places(double val){
		double res = Math.round(val * 100) / 100.0;
		return res;
	}
}
