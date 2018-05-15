package annotation;

import java.util.*;

@SuppressWarnings(value = "unchecked")
public class AnnotationTest {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "rawtypes" })
		List<String> myList = new ArrayList();

		System.out.println(useVarargs(new ArrayList<String>()));
	}

	@SafeVarargs
	public static <T> T useVarargs(T... args) {
		System.out.println(args.length);
		return args.length > 0 ? args[0] : null;
	}
}

class Fruit {
	public void info() {

	}
}

class Apple extends Fruit {

	@Override
	public void info() {

	}

	@Deprecated
	public void test() {

	}
}

@FunctionalInterface
interface FunctionInfterface{
	void test();
}
