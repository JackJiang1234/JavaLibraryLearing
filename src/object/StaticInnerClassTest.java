package object;

public class StaticInnerClassTest {
	private int porpl = 5;
	private static int prop2 = 9;
	
	static class StaticInnerClass{
		private static int age = 10;
		private int length = 1;
		public void accessOuterProp(){
			//System.out.println(prop1);
			System.out.println(prop2);
		}
	}
	
	public void accessInnerProp(){
		System.out.println(StaticInnerClass.age);
	}
	
	public static void main(String[] args) {
		StaticInnerClassTest test = new StaticInnerClassTest();
		test.accessInnerProp();

	}

}
