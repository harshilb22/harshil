package com.pack2;

public class ClientB {

	public static void main(String[] args) {

		MyRunnable obj = new MyRunnable();

		Thread t1 = new Thread(obj);
		t1.setName("ram");

		Thread t2 = new Thread(obj);
		t2.setName("tom");

		t1.start();
		t2.start();
		System.out.println(t1.getName() + "priority" + t1.getPriority());
		System.out.println(t2.getName() + "priority" + t2.getPriority());
		System.out.println("main priority" + Thread.currentThread().getPriority());
		for (int i = 1; i <= 1000; ++i) {
			System.out.println(Thread.currentThread().getName() + " " + (i * 5));
		}
		System.out.println("main ends");
	}

}
