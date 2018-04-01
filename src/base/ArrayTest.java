package base;

public class ArrayTest {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		// System.out.println(a[5]);
		//System.out.println(array.length);
		for (int e : array) {
			System.out.println(e);
		}
		
		char[] c={'a','b','c'};

		System.out.println(c instanceof char[]);
		System.out.println(c instanceof Object);
		System.out.println(c.getClass().getName());
		System.out.println(c.getClass().getSuperclass().getName());
		
		
		int[] i={1,2,3};
		long[] l={1l,2l,3l};
		float[] f={1f,2f,3f};
		String[] s={"aaa","bbb","ccc"};

		System.out.println(c.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(l.getClass().getName());
		System.out.println(f.getClass().getName());
		System.out.println(s.getClass().getName());
	}

}
