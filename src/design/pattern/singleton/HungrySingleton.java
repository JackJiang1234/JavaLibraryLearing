package design.pattern.singleton;

/**
 * 缺点就是，由于instance的初始化是在类加载时进行的，类加载是由ClassLoader来实现的，如果初始化太早，就会造成资源浪费。
 * */
public class HungrySingleton {

	private HungrySingleton() {
	}

	static HungrySingleton singleton = new HungrySingleton();

	private static HungrySingleton instance = new HungrySingleton();

	public static HungrySingleton getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
