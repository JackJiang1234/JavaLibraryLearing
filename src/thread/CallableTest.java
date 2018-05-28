package thread;

import java.util.concurrent.*;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Integer> task = new FutureTask<Integer>(() -> {
			int sum = 0;
			for (int i =0; i < 100 ; i++ )
			{
				sum += i;
			}
			// call()方法可以有返回值
			return sum;
		});
		
		Thread t = new Thread(task);
		t.start();
		
		int result = task.get();
		System.out.println(result);
	}

}
