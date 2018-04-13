package design.pattern.singleton;

/**
 * ȱ����ǣ�����instance�ĳ�ʼ�����������ʱ���еģ����������ClassLoader��ʵ�ֵģ������ʼ��̫�磬�ͻ������Դ�˷ѡ�
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
