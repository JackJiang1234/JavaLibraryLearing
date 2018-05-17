package io;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("readme.md");
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		System.out.println(Arrays.toString(File.listRoots())); 
		
		System.out.println(Paths.get("aa", "bb"));
	}

}
