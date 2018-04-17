package baselib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(System.getProperty("user.dir"));
		Scanner sc = new Scanner(new File("src/baselib/ScannerFileTest.java"));
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
