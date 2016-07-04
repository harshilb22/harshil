package com.pack1;

public class MyThread extends Thread {

	public void run() {
		for (int i = 1; i <= 1500; ++i) {
			System.out.println(Thread.currentThread().getName() + " " + (i * 5));
		}
	}
}
