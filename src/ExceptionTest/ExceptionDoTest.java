package ExceptionTest;

import java.util.*;

public class ExceptionDoTest {

	public static void main(String[] args) {

	}

	static void multiExceptionTest() {
		try {
			int c = 1 / 0;
		} catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e = new RuntimeException("test");
		}
	}

	static void basicTest() {
		try {
			int c = 1 / 0;
		} catch (ArithmeticException ex) {
			// System.out.println(ex);
			ex.printStackTrace();
		}
	}
}
