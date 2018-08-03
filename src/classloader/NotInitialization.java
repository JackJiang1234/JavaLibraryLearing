package classloader;

public class NotInitialization {

	/*
	 * -XX:+TraceClassLoading
	 * */
	public static void main(String[] args) {
		System.out.println(SubClass.value);

	}

}
