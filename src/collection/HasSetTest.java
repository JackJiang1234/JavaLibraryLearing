package collection;

import java.util.HashSet;

public class HasSetTest {

	

	/**
	 * HasSet 集合不允许添加重复的元素
	 */
	public static void main(String[] args) {
		HashSet books = new HashSet();
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		
		System.out.println(books);
	}

}

class A {
	public boolean equals(Object obj) {
		return true;
	}
}

class B {
	public int hashCode() {
		return 1;
	}
}

class C {
	public int hashCode(){
		return 2;
	}
	public boolean equals(Object obj){
		return true;
	}
}
