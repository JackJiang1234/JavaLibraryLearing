package io;

import java.io.*;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
		try (FileInputStream fis = new FileInputStream("./src/io/FileOutputStreamTest.java");
				FileOutputStream fos = new FileOutputStream("newFile.txt")) {
			byte[] buf = new byte[32];
			int hasRead = 0;
			while ((hasRead = fis.read(buf)) > 0) {
				fos.write(buf, 0, hasRead);
			}
		}

	}

}
