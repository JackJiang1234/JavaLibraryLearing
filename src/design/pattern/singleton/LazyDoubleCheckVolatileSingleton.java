package design.pattern.singleton;

/**
 * volatile ��ָֹ������,��instance����Ϊvolatile֮�󣬶�����д�����ͻ���һ���ڴ�����
 * volatile��ֹ�Ĳ���singleton = new Singleton()��仰�ڲ�[1-2-3]��ָ�����ţ�
 * ���Ǳ�֤����һ��д������[1-2-3]�����֮ǰ��������ö�������if (instance == null)����
 * */
public class LazyDoubleCheckVolatileSingleton {
	private static volatile LazyDoubleCheckVolatileSingleton instance = null;

	private LazyDoubleCheckVolatileSingleton() {
	}

	public static LazyDoubleCheckVolatileSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyDoubleCheckVolatileSingleton.class) {
				if (instance == null)
					instance = new LazyDoubleCheckVolatileSingleton();
			}
		}
		return instance;
	}
}
