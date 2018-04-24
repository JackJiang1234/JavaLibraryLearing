package generic;

import java.util.*;

/**
 * ֻ�д����ڱ���ʱû�г��־��棬�Ͳ�����������ʱClassCastException
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
