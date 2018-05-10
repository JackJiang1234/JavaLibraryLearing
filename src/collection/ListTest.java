package collection;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("book1", "book2");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		list.add("ccc");
	}
}
