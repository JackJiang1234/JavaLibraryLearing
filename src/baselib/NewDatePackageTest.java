package baselib;
import java.time.*;

public class NewDatePackageTest {

	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		
		System.out.println("duration test");
		
		Duration d = Duration.ofSeconds(6000);
		System.out.println(d.toMinutes());
		System.out.println(d.toHours());
		System.out.println(d.toDays());
		
		Clock clock2 = Clock.offset(clock, d);
		System.out.println(clock2.instant());
	}

}
