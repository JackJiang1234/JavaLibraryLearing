package collection;

import java.util.*;

public class ArrayDequeQueueTest {

	public static void main(String[] args) {
		ArrayDeque queue = new ArrayDeque();
		queue.offer("aaaa");
		queue.offer("bbbb");
		queue.offer("cccc");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
	}

}
