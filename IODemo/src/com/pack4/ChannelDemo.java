package com.pack4;

/*using N i/o*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream inFile = new FileInputStream("sap\\first.txt");

		FileChannel inChannel = inFile.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(1024);

		while (inChannel.read(buf) != -1) {
			buf.flip();
			// byte b = 0;
			while (buf.hasRemaining()) {
				System.out.println((char) buf.get());
			}
			buf.clear();
		}
		inFile.close();
	}

}
