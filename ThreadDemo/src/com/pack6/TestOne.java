package com.pack6;

public class TestOne implements Runnable {
public void run() {
for (int i = 0; i< 4; i++) {
System.out.print(i);
 }
 }
public static void main (String[] args) throws Exception {
 Thread t = new Thread(new TestOne());
t.start();
System.out.print("Started");
t.join();
System.out.print("Complete");
 }
}
