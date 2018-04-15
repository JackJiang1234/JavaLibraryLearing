package gc;

import java.lang.ref.SoftReference;

/**
 * 强引用，软引用，弱引用，虚引用
 * 软引用由SoftReference引用，当系统内存足够时，它不会被系统回收，
 * 当系统内存不足时，系统可能回收它
 * */
public class SoftReferenceTest {

	public static void main(String[] args) {

		String str = new String("test");
		
		SoftReference<String> wr = new SoftReference<String>(str);
		
		str = null;
		System.out.println(wr.get());
		
		System.gc();
		System.runFinalization();
		
		System.out.println(wr.get());
	}

}
