package gc;

import java.lang.ref.WeakReference;

/**
 * 强引用，软引用，弱引用，虚引用
 * 弱引用由WeakReference引用，当系统进行GC时，总是会回收该对象所占内存
 * */
public class WeakReferenceTest {

	public static void main(String[] args) {
		String str = new String("test");

		WeakReference<String> wr = new WeakReference<String>(str);

		str = null;
		System.out.println(wr.get());

		System.gc();
		System.runFinalization();

		System.out.println(wr.get());

	}

}
