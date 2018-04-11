package base;

public class VarargsTest {

	public static void test(String... books)
	{
		for(String b : books)
		{
			System.out.println(b);
		}
		
	}
	
	public static void main(String[] args) {
		test("a", "b", "c");
	}

}
