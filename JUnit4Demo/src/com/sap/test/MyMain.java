package com.sap.test;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestSuite;

public class MyMain {

	public static void main(String[] args) {
		PrintStream oldoutps = System.out; // get the current output stream
		try {

			FileOutputStream outfos = new FileOutputStream("Test_Output.htm"); // create
			PrintStream newoutps = new PrintStream(outfos); // create new output
			System.setOut(newoutps); // set the output stream
			Result res = JUnitCore.runClasses(AllTests.class);
			System.out.println("<h1>Output of Junit Testing</h1>");
			System.out.println("");
			System.out.println("<table cellpadding='10' bgcolor='#708090'>");
			System.out.println("<tr><td>runcount</td>");
			System.out.println("<td>" + res.getRunCount() + "</td></tr>");
			System.out.println("<tr><td> failure count</td>");
			System.out.println("<td>" + res.getFailureCount()+ "</td></tr>");
			System.out.println("<tr><td> all test case scucceds</td>");
			System.out.println("<td>" + res.wasSuccessful()+ "</td></tr>");
			System.out.println("</table>");
			System.out.println("<hr/>");
			System.out.println("<table cellpadding='10' bgcolor='#708090'>");
			 List<Failure> flrs = res.getFailures();
			    for(Failure f: flrs){
			    	System.out.println("<tr>");
			    	System.out.println("<td>" + f.getMessage()+ "</td>");
			       	System.out.println("<td>" + f.getDescription()+ "</td>");
			       	System.out.println("<td>" + f.getException()+ "</td>");
			       	System.out.println("<td>" + f.toString()+ "</td>");
			    	System.out.println("</tr>");
			    	
			    }
			    
			System.out.println("</table>");
			System.setOut(oldoutps); // for resetting the output stream

		} catch (Exception e) {
			System.out.println("some error");

		}

	}

	

}
