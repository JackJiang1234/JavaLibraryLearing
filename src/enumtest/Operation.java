package enumtest;

public enum Operation {
	ADD{
		public double eval(double x, double y){
			return x + y;
		}
	},
	
	MINUS{
		public double eval(double x, double y){
			return x - y;
		}
	};
	
	public abstract double eval(double x, double y);
}
