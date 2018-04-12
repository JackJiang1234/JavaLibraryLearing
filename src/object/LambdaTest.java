package object;
/**
 * 由三部分组成
 * 形参列表 ， 允许省略形参类型，如果只有一个参数，圆括号可以省略
 * 箭头 ->  
 * 代码块 ， 如果只有一条语句，Lambda允许省略花括号，只有一条return语句，可以省略return 
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
