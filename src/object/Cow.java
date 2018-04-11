package object;

public class Cow {
	private double weight;

	public Cow() {
	}

	public Cow(double weight) {
		this.weight = weight;
	}

	public void test() {
		CowLeg cl = new CowLeg(1.12, "red");
		cl.Info();
	}

	private class CowLeg {
		private double length;
		private String color;

		public CowLeg() {
		}

		public CowLeg(double length, String color) {
			this.length = length;
			this.color = color;
		}

		public void Info() {
			System.out.println(String.format("length=%f, color=%s", this.length, this.color));
			System.out.println("weight:" + weight);
			System.out.println("weight:" + Cow.this.weight);
		}
	}
}
