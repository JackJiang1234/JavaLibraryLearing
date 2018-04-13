package design.pattern.singleton;

/**
 * 由于原子操作和指令重排可能造 成实例未初始化完成就被使用
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
