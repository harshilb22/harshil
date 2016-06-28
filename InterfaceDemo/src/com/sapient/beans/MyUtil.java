package com.sapient.beans;

public class MyUtil {
	private static Bank bank = new Bank();

	public static Atm getAtm() {
		
		Atm atm = bank;
		return atm;
	}
	
	public Offline getOffline(){
		Offline off = bank;
		return off;
	}
	
	public static Agent getAgent(){
		Agent agent = bank;
		return agent;
	}
}