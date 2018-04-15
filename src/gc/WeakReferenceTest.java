package gc;

import java.lang.ref.WeakReference;

/**
 * ǿ���ã������ã������ã�������
 * ��������WeakReference���ã���ϵͳ����GCʱ�����ǻ���ոö�����ռ�ڴ�
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
