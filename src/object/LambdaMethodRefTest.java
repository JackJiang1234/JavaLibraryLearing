package object;

@FunctionalInterface
interface Converter {
	Integer convert(String from);
}

@FunctionalInterface
interface Converter2 {
	Integer convert2(String from);
}

@FunctionalInterface
interface MyTest {
	String test(String a, int b, int c);
}

@FunctionalInterface
interface FacotryTest {
	LambdaMethodRefTest create();
}

public class LambdaMethodRefTest {

	public static void main(String[] args) {
		Converter con = Integer::valueOf;
		System.out.println(con.convert("10"));

		Converter2 con2 = "abc"::indexOf;
		System.out.println(con2.convert2("b"));
		
		MyTest m = String::substring;
		System.out.println(m.test("abcd", 2, 3));
		
		FacotryTest objfactory = LambdaMethodRefTest::new;
		objfactory.create();
	}

}
