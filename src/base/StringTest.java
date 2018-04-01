package base;

public class StringTest {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str);
		
		for(int i = 0; i < str.length(); i++)
		{
			System.out.println(str.codePointAt(i));
		}
		
		System.out.println(3 + 4 + "hello");
		System.out.println("hello" + 3 + 4);
	}

}
