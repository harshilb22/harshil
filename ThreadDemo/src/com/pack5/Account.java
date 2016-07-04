package com.pack5;

public class Account {
	public volatile int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {

		return balance;
	}

	private void setBalance(int balance) {

		this.balance = balance;
	}

	public void deposit(String name, int amt) {
		/*
		 * System.out.println(name + " trying to deposit :" + amt);
		 * System.out.println(name + " getting balance "); int bal =
		 * getBalance(); bal += amt; System.out.println(name +
		 * " setting balance to :" + bal); setBalance(bal);
		 * System.out.println(name + " completes deposit");
		 */
		for (int i = 1; i <= 500; ++i) {
			System.out.println(name + " doing tx ");
		}
	}

}
