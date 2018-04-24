package generic;

import java.util.*;

public class MyUtils {

	/**
	 * ? super T  ����Ԫ�ر�����T�ĸ����ͻ��� 
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
