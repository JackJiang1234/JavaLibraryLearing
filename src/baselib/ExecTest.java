package baselib;

import java.io.IOException;

public class ExecTest {

	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		Process p = rt.exec("notepad.exe");
		
	}

}
