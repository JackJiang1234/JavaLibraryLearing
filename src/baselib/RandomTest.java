package baselib;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextBoolean());
		
		byte[] buffer = new byte[16];
		rand.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		
		System.out.println(rand.nextInt(10));
		
		ThreadLocalRandom trand = ThreadLocalRandom.current();
		System.out.println(trand.nextInt()); 
	}

}
