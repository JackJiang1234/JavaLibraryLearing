package ExceptionTest;

import java.io.*;

public class FinallyTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("a.text");
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
			//return;
			System.exit(1);
		}
		finally{
			if (fis != null){
				try {
					fis.close();
				}
				catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
			System.out.println("execute finally block.");
		}
	}

}
