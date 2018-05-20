package io;

import java.io.*;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		try(FileInputStream fis = new FileInputStream("./src/io/FileInputStreamTest.java"))
		{
			byte[] buf = new byte[1024];
			int hasRead = 0;
			while ((hasRead = fis.read(buf)) > 0)
			{
				System.out.println(new String(buf, 0, hasRead));
			}
		}
	}

}
