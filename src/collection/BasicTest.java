package collection;

import java.util.*;

public class BasicTest {

	public static void main(String[] args) {
		setTest();
		listTest();
		mapTest();
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
		ArrayList<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.removeIf(item -> item.length() == 1);
		System.out.println(list.size());
		System.out.println(String.join(",", list));
		System.out.println("list test end.");
	}
	
	static void queuTest(){
		
	}
	
	static void mapTest(){
		System.out.println("map test begin...");
		
		HashMap<String, String> map = new HashMap<>();
		map.put("aa", "bb");
		map.put("cc", "dd");
		
		map.forEach((k, v) -> System.out.println(k + "->" + v));
		
		System.out.println("map test end.");
	}
}
