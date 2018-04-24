package generic;

import java.util.*;

/**
 * 只有代码在编译时没有出现警告，就不会遇到运行时ClassCastException
 * */
public class GenericWildcardTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaaa");
		list.add("bbbb");
		
		new GenericWildcardTest().test(list);
	}
	
	public void test(List<?> list){
		list.forEach(System.out::println);
	}
}
