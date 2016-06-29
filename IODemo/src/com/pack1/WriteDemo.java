package com.pack1;

/*creating a file and folder*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
	public static void main(String[] args) throws IOException {

		File folder = new File("sap");
		if (!folder.exists())
			folder.mkdir();
		FileWriter fw = new FileWriter("sap\\first.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("ram is a good boy\n");
		bw.write("abcdefgh");
		bw.close();
		fw.close();
		System.out.println("file created");
	}
}