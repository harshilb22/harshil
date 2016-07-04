package com.pack6;

public class Que {
	
	private String data;
	boolean valueset = false;

	public synchronized void get() {
		System.out.println("consumer");
		if (!valueset) {
			try {
				System.out.println("Inside Get -switch to producer");
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("got "  + data);
		valueset = false;
		notify();
	}

	
	public synchronized void put( String str) {
		System.out.println("producer");
		if (valueset) {
			System.out.println("Inside Put -switch to consumer");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		
		data = str;
		valueset = true;
		System.out.println("put " + data);

		notify();
	}
}