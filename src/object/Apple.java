package object;
import static java.lang.System.*;

public class Apple {
	private String color;
	private double weight;
	
	public Apple(String color, double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	
	public String toString()
	{
		return "Apple[color=" + color + ", weight=" + weight + "]";
	}
	
	public static void main(String[] args) {
		out.println(new Apple("red", 4.5f));
	}

}
