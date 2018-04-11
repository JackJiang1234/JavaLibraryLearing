package object;

import static java.lang.System.*;

public class EqualTest {

	public static void main(String[] args) {
		
		out.println("65 == 65.f ? " + (65 == 65.0f));
		out.println("65 == 'A'?" + (65 == 'A'));
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		out.println(str1 == str2);
		out.println(str1.equals(str2));
		
		
		
	}

}
