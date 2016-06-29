package com.sapient.beans;

import com.sapient.util.MyUtil;

public class Interest {
	private double amt;
	private int years;
	private float rate;

	public Interest(double amt, int years, float rate) throws Exception {
		
		if (amt<= 0 || years <= 0 || rate <= 0)
			throw new Exception("amt or years or rate must be greater than 0");
		this.amt = amt;
		this.years = years;
		this.rate = rate;
	}

	public double calcSimple() {
		return MyUtil.round2places(amt * rate * years / 100);

	}

	public double calcCompound() {
		return MyUtil.round2places(amt * Math.pow((1 + rate / 100), years) - amt);
	}
}
