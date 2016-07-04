package com.pack4;


public class BankingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account account = new Account(5000);
		TomThread t1 = new TomThread(account, "tom", 2500);
		
		PeterThread t2 = new PeterThread(account, "Peter", 3000);
		
		t1.start();
		t2.start();
		
		
		System.out.println("All Threads started...");
		System.out.println("Final Balance : " + account.getBalance());
	}

}
