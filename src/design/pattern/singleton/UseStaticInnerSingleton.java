package design.pattern.singleton;

/**
 * �����ڲ���SingletonHolder������һ������ʽ�ĵ���ʵ�֣�
 * ��SingletonHolder��ʼ����ʱ�����ClassLoader����֤ͬ����
 * ʹINSTANCE��һ���浥����ͬʱ������SingletonHolder��һ���ڲ��࣬
 * ֻ���ⲿ���Singleton��getInstance()�б�ʹ�ã�
 * �����������ص�ʱ��Ҳ������getInstance()������һ�α����õ�ʱ��
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
