package oom;

import java.util.ArrayList;

public class HeapOOMTest {

	static class OOMObject{
		
	}
	public static void main(String[] args) {
		ArrayList<OOMObject> list = new ArrayList<OOMObject>();
		while(true)
		{
			list.add(new OOMObject());
		}
	}

}
