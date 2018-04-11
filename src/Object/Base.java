package Object;

import static java.lang.System.*;

public class Base {
	public static int staticField = setStaticField("1");
	public int instanceField = setInstanceField();

	public Base() {
		out.println("base constructor");
	}

	{
		out.println("base instance init");
	}

	static {
		out.println("base static init");
	}

	public static int staticField2 = setStaticField("2");

	static int setStaticField(String str) {
		out.println("base static field set" + str);
		return 1;
	}

	int setInstanceField() {
		out.println("base instance feild set");
		return 1;
	}

	public void say() {
		out.println("this is base.");
	}
}
