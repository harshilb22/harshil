package com.pack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Penguins.jpg");
		FileOutputStream fos = new FileOutputStream("Sapient.jpg");
		int size = fis.available();
		byte[] arr = new byte[size];
		fis.read(arr);
		fos.write(arr);
		fis.close();
		fos.close();
		System.out.println("image copied...");
	}

}
