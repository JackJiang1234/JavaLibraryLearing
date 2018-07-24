package gc;

public class FinalizeTest {
	private static FinalizeTest ft = null;
	
	public void info(){
		System.out.println("info test");
	}
	
	public static void main(String[] args) {
		new FinalizeTest();
		System.gc();
		System.runFinalization();
		
		ft.info();
	}
	
	public void finalize(){
		ft = this;
	}
}
