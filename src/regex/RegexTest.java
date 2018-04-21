package regex;

import java.util.regex.*;

public class RegexTest {

	public static void main(String[] args) {
		//Greedy, Reluctant 
		String str = "hello, java";
		System.out.println(str.replaceFirst("\\w*", "_"));
		System.out.println(str.replaceFirst("\\w*?", "_"));
		System.out.println(str.replaceFirst("\\w+", "_"));
		System.out.println(str.replaceFirst("\\w+?", "_"));
		
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		System.out.println(m.matches());
	}

}
