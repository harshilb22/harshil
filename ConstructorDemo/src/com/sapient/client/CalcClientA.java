package com.sapient.client;

import com.sapient.beans.StdCalculator;

public class CalcClientA {
public static void main(String[] args){
	try {
		StdCalculator calc = new StdCalculator(56.37867);
		System.out.println(calc.round2decimal());
		System.out.println(calc.round2decimal(3));
		System.out.println(calc.convert2Int());
		
	}catch (Exception e){
		System.out.println(e.getMessage());
	}
	//invoking a cons with int arg
	try {
		StdCalculator calc = new StdCalculator(200);
		System.out.println(calc.converttoBin());
		System.out.println(calc.converttoOct());
		System.out.println(calc.converttoHex());
		
	}catch (Exception e){
		System.out.println(e.getMessage());
	}
	//invoking a constructor with 2 args
	try {
		StdCalculator calc = new StdCalculator(20.7889,50.3875);
		System.out.println(calc.doAdd());
		System.out.println(calc.doSub());
		System.out.println(calc.doMultiply());
		System.out.println(calc.round2decimal());
		System.out.println(calc.round2decimal(3));
		System.out.println(calc.converttoBin());
		
	}catch (Exception e){
		System.out.println(e.getMessage());
	}
}
}