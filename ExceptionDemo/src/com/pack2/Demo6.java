/*rethrowing and exception*/

package com.pack2;

public class Demo6 {

	public static void main(String[] args) {

		try {
			approveLoan(30, 500000);

		} catch (AgeException | IncomeException e) {
			System.out.println(e.getMessage());

		}

	}

	public static String approveLoan(int age, double income) throws AgeException, IncomeException {
		String res = "loan approved";
		try {
			if (age < 20 || age > 40)
				throw new AgeException("age must be between 20 and 40");
			if (income < 400000)
				throw new IncomeException("income must be minimum 4 lakhs");
		} catch (AgeException | IncomeException e) {
			throw e;
		}
		return res;
	}

}
