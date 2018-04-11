package base;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] a = new int[10];
		Arrays.fill(a, 1);
		
		for(int e : a)
		{
			System.out.println(e);
		}
		System.out.println(Arrays.toString(a));
		
		int[] arr1 = { 3, -4, 25, 16, 30};
		Arrays.parallelSort(arr1);
		System.out.println("sort after:" + Arrays.toString(arr1));
		
		int[] arr2 = { 3, -4, 35, 18, 40, 19};
		Arrays.parallelPrefix(arr2, (left, right) -> left * right);
		System.out.println(Arrays.toString(arr2));
		
		Arrays.parallelSetAll(arr2, i -> i * 5);
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
