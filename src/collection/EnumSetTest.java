package collection;

import java.util.Collections;
import java.util.EnumSet;

enum Season
{
	SPRING, SUMMER, FALL, WINTER
}

public class EnumSetTest {

	public static void main(String[] args) {
		EnumSet<Season> es1 = EnumSet.allOf(Season.class);
		System.out.println(es1);
		
		EnumSet<Season> es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2);
		
		Collections.synchronizedSet(es1);
	}

}
