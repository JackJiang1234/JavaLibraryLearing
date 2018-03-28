package oom;

public class JVMStackTest {
	
	private int stacklength = 1;
	
	public void stackLeak(){
		this.stacklength++;
		stackLeak();
	}
	
	public static void main(String[] args) {
		JVMStackTest oom = new JVMStackTest();
		try {
			oom.stackLeak();
		}catch(Throwable e){
			System.out.println("stack length:" + oom.stacklength);
			throw e;
		}
	}

}
