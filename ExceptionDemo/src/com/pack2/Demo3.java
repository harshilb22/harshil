/*Multi catch*/


package com.pack2;

public class Demo3 {
	public static void main(String[] args) {

		try {
			String res = approveLoan(30,500000);
			System.out.println(res);
		} catch (AgeException | IncomeException e) {
			System.out.println(e.getMessage());
			
		}

	}

	public static String approveLoan(int age, double income) throws AgeException, IncomeException {
		String res = "loan approved";
		if (age < 20 || age > 40)
			throw new AgeException("age must be between 20 and 40");
		if (income < 400000)
			throw new IncomeException("income must be minimum 4 lakhs");
		return res;
	}
}
