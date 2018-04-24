package generic;

import java.util.*;

interface Shape {
	void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("this is circle");
	}
}

public class GenericUpboundTest {

	public static void main(String[] args) {
		ArrayList<Circle> list = new ArrayList<>();
		list.add(new Circle());

		new GenericUpboundTest().drawAll(list);
	}

	public void drawAll(List<? extends Shape> shapes) {
		shapes.forEach(s -> s.draw());
	}
}
