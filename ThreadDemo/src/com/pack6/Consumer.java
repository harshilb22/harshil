package com.pack6;

public class Consumer extends Thread {


	private Que q;
	public Consumer(Que ob)
	{
		q=ob;
		
	}
	public void run()
	{
		int i=1;
		while(i<=5)
		{
			q.get();
			++i;
		}
		
	}
}
    