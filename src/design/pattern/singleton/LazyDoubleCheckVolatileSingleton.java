package design.pattern.singleton;

/**
 * volatile 禁止指令重排,把instance声明为volatile之后，对它的写操作就会有一个内存屏障
 * volatile阻止的不是singleton = new Singleton()这句话内部[1-2-3]的指令重排，
 * 而是保证了在一个写操作（[1-2-3]）完成之前，不会调用读操作（if (instance == null)）。
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
