package base;
import static java.lang.System.*;

public class Primitive2String {

	public static void main(String[] args) {
		//×Ô¶¯×°Ïä£¬²ğÏä
		String intStr = "123";
		int it1 = Integer.parseInt(intStr);
		int it2 = Integer.valueOf(intStr);
		
		out.println(it2);
		out.println(it1);
		
		String floatStr = "4.56";
		float ft1 = Float.parseFloat(floatStr);
		float ft2 = Float.valueOf(floatStr);
		
		out.println(ft1);
		out.println(ft2);
		
		out.println(String.valueOf(2.345f));
		
		Integer inta = 2;
		Integer intb = 2;
		out.println(inta == intb);
		
		Integer intc = 128;
		Integer intd = 128;
		out.println(intc == intd);
	}

}
