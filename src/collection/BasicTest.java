package collection;

import java.util.*;

public class BasicTest {

	public static void main(String[] args) {
		setTest();
		listTest();
	}

	static void setTest() {
		System.out.println("set test begin...");
		// TODO Auto-generated method stub
		HashSet<Object> set = new HashSet<>();

		System.out.println(set.add(null));
		System.out.println(set.add(null));
		System.out.println(set.add(1));

		System.out.println(set.contains(null));
		System.out.println(set.size());
		System.out.println("set test end.");
	}

	static void listTest() {
		System.out.println("list test begin...");
		ArrayList<Object> list = new ArrayList<>();
		list.add("aa");
		list.add("aa");
		System.out.println(list.size());
		System.out.println("list test end.");
	}
}
