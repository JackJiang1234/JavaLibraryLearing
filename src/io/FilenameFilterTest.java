package io;

import java.io.*;

public class FilenameFilterTest {

	public static void main(String[] args) {
		File file = new File(".");
		String[] nameList = file.list((dir, name) -> name.endsWith(".java") 
				|| new File(name).isDirectory());
		for(String str : nameList){
			System.out.println(str);
		}
	}

}
