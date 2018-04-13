package design.pattern.singleton;

/**
 * 对于内部类SingletonHolder，它是一个饿汉式的单例实现，
 * 在SingletonHolder初始化的时候会由ClassLoader来保证同步，
 * 使INSTANCE是一个真单例。同时，由于SingletonHolder是一个内部类，
 * 只在外部类的Singleton的getInstance()中被使用，
 * 所以它被加载的时机也就是在getInstance()方法第一次被调用的时候。
 * */
public class UseStaticInnerSingleton {
	private static class SingletonHolder {
		private static final UseStaticInnerSingleton instance = new UseStaticInnerSingleton();
	}

	private UseStaticInnerSingleton() {
	}

	public static final UseStaticInnerSingleton getInstance() {
		return SingletonHolder.instance;
	}
}
