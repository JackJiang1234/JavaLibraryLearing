package baselib;

public class RuntimeTest {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("processor:" + rt.availableProcessors());
		System.out.println("free memory:" + rt.freeMemory());
		System.out.println("total memory:" + rt.totalMemory());
		System.out.println("max memory:" + rt.maxMemory());
	}

}
