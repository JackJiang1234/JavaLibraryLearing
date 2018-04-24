package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.MediaSize.Other;

public class DiamondTest {

	public static void main(String[] args) {
		List<String> books = new ArrayList<>();
		books.add("java");
		books.add("csharp");
		books.forEach(str -> System.out.println(str));
		
		List<Integer> other = new ArrayList<>();
		System.out.println(books.getClass() == other.getClass());
		
		Map<String, List<String>> schoolInfo = new HashMap<>();
		List<String> schools = new ArrayList<>();
		schools.add("chasha");
		schools.add("beigin");
		schoolInfo.put("niuniu", schools);
		schoolInfo.forEach((key, value) -> System.out.println(key + "-->" + value));
	}

}
