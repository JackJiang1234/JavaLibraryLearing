package gc;

public class GcTest {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++){
			new GcTest();
			
			//System.gc();
			Runtime.getRuntime().gc();
		}
	}
	
	@Override
	public void finalize(){
		System.out.println("finalize...");
	}

}
