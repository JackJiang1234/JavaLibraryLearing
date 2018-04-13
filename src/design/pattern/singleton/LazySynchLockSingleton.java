package design.pattern.singleton;

/**
 * �����˿��ܻ���ֵĶ��ʵ�����⣬���ǻ�ǿ�Ƶ�ǰ�߳�֮��������̵߳ȴ���ʵ���ϻ�Գ����ִ��Ч����ɸ���Ӱ�졣
 * */
public class LazySynchLockSingleton {

	private static LazySynchLockSingleton instance = null;

	private LazySynchLockSingleton() {
	}

	public static LazySynchLockSingleton getInstance() {
		synchronized (LazySynchLockSingleton.class) {
			if (instance == null)
				instance = new LazySynchLockSingleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
