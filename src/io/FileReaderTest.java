package io;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileReader fr = new FileReader("./src/io/FileReaderTest.java")) {
			char[] buf = new char[32];
			int hasRead = 0;
			while ((hasRead = fr.read()) > 0) {
				System.out.println(new String(buf, 0, hasRead));
			}
		}

	}

}
