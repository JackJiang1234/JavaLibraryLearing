package base;

import static java.lang.System.*;


public class InitBlockTest {

	static {
		out.println("static init");
	}
	
	{
		out.println("instance init");
	}
	
	public InitBlockTest()
	{
		out.println("constroctor");
	}
	
	public static void main(String[] args) {
		new InitBlockTest();

	}

}
