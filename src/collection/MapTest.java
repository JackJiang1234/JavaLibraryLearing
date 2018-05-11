package collection;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("aaa", 109);
		map.put("bbb", 122);
		map.put("ccc", 101);
		map.put("ddd", 101);
		
	
		System.out.println(map);
		map.remove(new String("ddd"));
		
		System.out.println(map);
	}
}
