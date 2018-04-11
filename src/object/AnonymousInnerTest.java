package object;

interface Product{
	public double getPrice();
	public String getName();
}

public class AnonymousInnerTest {
	public void test(Product p)
	{
		System.out.println("buy a " + p.getName() + ", cost " + p.getPrice());
	}
	
	public static void main(String[] args) {
		int num = 2;
		AnonymousInnerTest ta = new AnonymousInnerTest();
		ta.test(new Product(){
			public double getPrice(){
				return num * 5.6;
			}
			public String getName(){
				return "book";
			}
		});
	}

}
