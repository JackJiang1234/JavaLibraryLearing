package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<Object> books = new LinkedHashSet<>();
		books.add("aaa");
		books.add("bbb");
		System.out.println(books);
		books.remove("aaa");
		books.add("ccc");
		System.out.println(books);
	}

}
