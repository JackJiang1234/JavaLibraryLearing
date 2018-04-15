package gc;

import java.lang.ref.SoftReference;

/**
 * ǿ���ã������ã������ã�������
 * ��������SoftReference���ã���ϵͳ�ڴ��㹻ʱ�������ᱻϵͳ���գ�
 * ��ϵͳ�ڴ治��ʱ��ϵͳ���ܻ�����
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
