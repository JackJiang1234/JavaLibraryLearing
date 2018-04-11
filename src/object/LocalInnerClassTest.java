package object;

public class LocalInnerClassTest {

	public static void main(String[] args) {
		class InnerBase{
			int a;
		}
		
		class InnerSub extends InnerBase{
			int b;
		}
		
		InnerSub is = new InnerSub();
		is.a = 5;
		is.b = 8;
		
		System.out.println(String.format("%d, %d", is.a, is.b));
	}

}
