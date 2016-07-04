package com.pack1;

public class ClientB {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("ram");
		t1.setPriority(Thread.MIN_PRIORITY);
		MyThread t2 = new MyThread();
		t2.setName("tom");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		/*
		 * for (int i = 1; i <= 1500; ++i) {
		 * System.out.println(Thread.currentThread().getName() + " " + (i * 7));
		 * }
		 */

		System.out.println("main thread ends");
	}

}
