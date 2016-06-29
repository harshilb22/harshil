package com.sapient.beans;

public class Searcher {
private int n;
private String search;
	private String[] names = new String[n];

	public Searcher(String[] names) throws Exception {
		super();
		if (names.length > 4)
			throw new Exception("length must be greater than 4");
			this.names = names;

	}

	public String[] getNames() {
		return names;
	}

	public String doSearch() {
		for (i = 0; i < n; i++)
		      array[i] = in.next();
		 
		    System.out.println("Enter value to find");
		    search = in.nextInt();
		for (int i = 0; i < n; i++)
	    {
	      if (names[i] == search)     /* Searching element is present */
	      {
	         System.out.println(search + " is present at location " + (i + 1) + ".");
	          break;	
	}
}
