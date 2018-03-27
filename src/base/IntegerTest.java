package base;

import java.io.*;

public class IntegerTest {

	public static void main(String[] args) {
		PrintStream p = System.out;
		
		p.println(Integer.MIN_VALUE);
		p.println(Integer.MAX_VALUE);
		
		
		// ����ת���������ַ���
		int c = 100;
		for (int i = 2; i < 17; i++) {
			String result = Integer.toString(c, i);
			p.println(String.format("%dת�� %d���ƵĽ����%s", c, i, result));
		}
		

		// bit count
		for (int i = 10; i < 20; i++) {
			String bin = Integer.toString(i, 2);
			p.println(String.format("%dת����������%s, ����%d��1.", i, bin, Integer.bitCount(i)));
		}
		
		//compare
		Integer i1 = 100;
		Integer i2 = 101;
		i1.compareTo(i2);
		
		p.println(Integer.decode("1"));
		p.println(Integer.decode("0x10"));
		p.println(Integer.decode("010"));
		
		p.println(Integer.parseInt("11"));
		
		Integer.remainderUnsigned(1, 2);
		Integer.reverse(11);
		Integer.signum(1);
		
		Integer.valueOf(1);
		p.println(Integer.toHexString(110));
		
	}

}
