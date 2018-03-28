package base;

import java.util.function.BiConsumer;

public class SystemTest {

	public static void main(String[] args) {
		BiConsumer<Object, Object> biConsumer = (key, value) -> System.out.println(String.format("%s-->%s", key, value));
		//显示环境变量
		System.out.println("show evn begin.....");
		System.getenv().forEach(biConsumer);
		
		System.out.println("show properties begin.....");
		System.getProperties().forEach(biConsumer);
		
		System.identityHashCode(1);
		
		Runtime current = Runtime.getRuntime();
		System.out.println(current.availableProcessors());
		System.out.println(current.totalMemory());
	}
	

}
