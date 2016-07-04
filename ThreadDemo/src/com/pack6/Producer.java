package com.pack6;

import java.util.Scanner;

public class Producer extends Thread
{
	private static Scanner scan = new Scanner(System.in);
		private Que q;
		public Producer(Que ob)
		{
			q=ob;
			
		}
	public void run()
	{
		int i=1;
		while(i<=5)
		{
			
			String str = scan.next();
			q.put( str);
			++i;
		}
		
		
	}
}