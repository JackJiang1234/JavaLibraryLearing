package design.pattern.singleton;

/**
 * ���߳��޷���֤����
 * */
public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
