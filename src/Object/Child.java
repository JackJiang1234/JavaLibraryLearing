package Object;

import static java.lang.System.*;

public class Child extends Base {

	public static int staticField = setStaticField();
	public int instanceField = setInstanceField();

	public Child() {
		out.println("child constructor");
	}

	{
		out.println("child instance init");
	}

	static {
		out.println("child static init");
	}

	static int setStaticField() {
		out.println("child static field set");
		return 1;
	}

	int setInstanceField() {
		out.println("child instance feild set");
		return 1;
	}

	public void say() {
		out.println("this is child.");
		super.say();
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.say();

		Base b = (Base) c;
		b.say();

		out.println(c instanceof Base);

		out.println("done!");
	}

}
