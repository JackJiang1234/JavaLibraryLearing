package generic;

public class AppleTest<T extends Number & java.io.Serializable> {
	
	private T info;
	
	//static T test;
	//public static void bar(T info){}
	
	public AppleTest(){}
	
	public AppleTest(T info){
		this.info = info;
	}
	
	public void setInfo(T info){
		this.info = info;
	}
	
	public T getInfo(){
		return this.info;
	}
	
	public static void main(String[] args) {
		AppleTest<Integer> s1 = new AppleTest<>(222);
		System.out.println(s1.getInfo());
		AppleTest<Double> d1 = new AppleTest<>(5.666);
		System.out.println(d1.getInfo());

	}

}
