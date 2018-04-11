package object;

public interface Output {
	int MAX_CACHE_LINE = 50;

	void out();

	void getDate();

	default void print(String... msgs) {
		for (String str : msgs) {
			System.out.println(str);
		}
	}

	default void test() {
		System.out.println("default test method");
	}

	static void staticTest() {
		System.out.println("static test");
	}
}
