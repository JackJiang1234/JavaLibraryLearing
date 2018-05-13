package ExceptionTest;

import java.io.*;

public class AutoCloseTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest.java"));
			PrintStream ps = new PrintStream(new FileOutputStream("a.text")))
		{
			System.out.println(br.readLine());
			ps.println();
		}

	}

}
