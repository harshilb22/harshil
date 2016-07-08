package com.sap.actual;

public class LoanService {

	public boolean approveLoan(int age, double income) throws AgeException, IncomeException {
		if (age < 20 || age > 40)
			throw new AgeException("valid age must be between 20 and 40");
		if (income < 400000)
			throw new IncomeException("income must be min 4 lakhs");
		return true;
	}
}
