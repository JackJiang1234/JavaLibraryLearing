package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.setProperty("username", "jack");
		props.setProperty("password", "223");
		props.store(new FileOutputStream("a.ini"), "comment line");
		props.storeToXML(new FileOutputStream("a.xml"), "comment test");
		
		Properties props2 = new Properties();
		props2.setProperty("gender", "male");
		props2.load(new FileInputStream("a.ini"));
		System.out.println(props2);
	}

}
