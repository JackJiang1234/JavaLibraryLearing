package object;
/**
 * �����������
 * �β��б� �� ����ʡ���β����ͣ����ֻ��һ��������Բ���ſ���ʡ��
 * ��ͷ ->  
 * ����� �� ���ֻ��һ����䣬Lambda����ʡ�Ի����ţ�ֻ��һ��return��䣬����ʡ��return 
 * */
public class LambdaTest {
	
	public void eat(Eatable e){
		System.out.println(e);
		e.taste();
	}
	
	public void drive(Flyable f){
		System.out.println("I'm driving " + f);
		f.fly("good weather");
	}
	
	public void test(Addable add){
		System.out.println(add.add(5, 3));
	}
	
	public static void main(String[] args) {
		LambdaTest lt = new LambdaTest();
		lt.eat(() -> System.out.println("apple tase good"));
		lt.drive(weather -> { System.out.println("today weather:" + weather);});
		lt.test((a, b) -> a + b);
	}

}

interface Eatable{
	void taste();
}

interface Flyable{
	void fly(String weather);
}

interface Addable{
	int add(int a, int b);
}
