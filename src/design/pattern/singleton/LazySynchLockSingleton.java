package design.pattern.singleton;

/**
 * 避免了可能会出现的多个实例问题，但是会强制当前线程之外的所有线程等待，实际上会对程序的执行效率造成负面影响。
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
