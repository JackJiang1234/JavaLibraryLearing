package base;

public class FloatTest {

	public static void main(String[] args) {
		float af = 5.23455556f;
		System.out.println(af);
		
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		System.out.println(c == d);
		
		int binVal = 0B1000_0000_0000_0011;
		double pi = 3.14_15_92_65_36;
		
		System.out.println(binVal);
		System.out.println(pi);
		
		System.out.println(a / a);
		System.out.println(a / a == Float.NaN);
		System.out.println(6.0 / 0 == 555.0 / 0);
		System.out.println(-8 / a);
	}

}
