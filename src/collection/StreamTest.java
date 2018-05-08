package collection;

import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {
		IntStream is = IntStream.builder().add(20).add(13).add(10).build();
		//System.out.println(is.max().getAsInt());
		//System.out.println(is.min().getAsInt());
		System.out.println(is.sum());
	}

}
