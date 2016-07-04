package com.pack5;


public class BankingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account account = new Account(5000);
		TomThread t1 = new TomThread(account, "A", 2500);
		
		PeterThread t2 = new PeterThread(account, "\tB", 3000);
		
		t1.start();
		t2.start();
		
		
		System.out.println("All Threads started...");
		System.out.println("Final Balance : " + account.getBalance());
	}

}
