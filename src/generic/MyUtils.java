package generic;

import java.util.*;

public class MyUtils {

	/**
	 * ? super T  限制元素必须是T的父类型或本身 
	 * parent super child
	 * */
	public static <T> T copy(Collection<? super T> dest, Collection<T> src){
		T last = null;
		for(T ele : src){
			dest.add(ele);
			last = ele;
		}
		return last;
	}
	
	public static void main(String[] args) {
		List<Number> ln = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		li.add(5);
		copy(ln, li);
		
		System.out.println(ln);
	}

}
