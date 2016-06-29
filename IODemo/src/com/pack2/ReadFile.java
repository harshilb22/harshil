package com.pack2;

/*reading char by char from buffer*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("sap\\first.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int ch = 0;
		while ((ch = bis.read()) != -1) {
			System.out.print((char) ch);
		}
		bis.close();
		fis.close();
	}

}
