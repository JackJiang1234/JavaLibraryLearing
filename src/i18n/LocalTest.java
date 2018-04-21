package i18n;

import java.util.Locale;

public class LocalTest {

	public static void main(String[] args) {
		Locale[] list = Locale.getAvailableLocales();
		for(Locale l : list){
			System.out.println("country:" + l.getCountry() + ",language:" + l.getLanguage());
		}
	}

}
