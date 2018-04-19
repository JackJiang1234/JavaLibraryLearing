package baselib;

import static java.util.Calendar.*;

import java.util.Calendar;

public class CalendarLazyTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2003, 7, 31);
		
		c.set(MONTH, 8);
		//System.out.println(c.getTime());
		c.set(DATE, 5);
		System.out.println(c.getTime());
	}
}
