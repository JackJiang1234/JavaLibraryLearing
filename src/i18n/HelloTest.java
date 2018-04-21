package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloTest {

	public static void main(String[] args) {
		Locale my = Locale.getDefault(Locale.Category.FORMAT);
		ResourceBundle bundle = ResourceBundle.getBundle("mess", my);
		System.out.println(bundle.getString("hello"));
	}

}
