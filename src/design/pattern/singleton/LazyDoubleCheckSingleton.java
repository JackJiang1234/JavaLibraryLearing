package design.pattern.singleton;

/**
 * ����ԭ�Ӳ�����ָ�����ſ����� ��ʵ��δ��ʼ����ɾͱ�ʹ��
 * http://mp.weixin.qq.com/s/91H5oXJuv7ChXXKyKjNr0w
 * */
public class LazyDoubleCheckSingleton {
	private static LazyDoubleCheckSingleton instance = null;

	private LazyDoubleCheckSingleton() {
	}

	public static LazyDoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyDoubleCheckSingleton.class) {
				if (instance == null)
					instance = new LazyDoubleCheckSingleton();
			}
		}
		return instance;
	}
}
