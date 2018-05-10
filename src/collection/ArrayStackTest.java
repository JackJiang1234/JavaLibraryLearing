package collection;

import java.util.*;

public class ArrayStackTest {

	public static void main(String[] args) {
		ArrayDeque stack = new ArrayDeque();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}

}
