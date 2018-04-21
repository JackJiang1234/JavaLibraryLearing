package regex;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * find group
 * */
public class FindGroupTest {

	public static void main(String[] args) {
		//basicFindGroupTest();
		//startEndTest();
		//ResetTest();
		//lookingAtTest();
		//replaceTest();
		split();
	}
	
	static void basicFindGroupTest(){
		String str = "abcdefdfd  13420919234, anohtdfd 13420929334";
		Matcher m = Pattern.compile("((13\\d))\\d{8}").matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
	}
	
	static void startEndTest(){
		String regStr = "java is very easy!";
		System.out.println("source string:" + regStr);
		Matcher m = Pattern.compile("\\w+").matcher(regStr);
		while(m.find()){
			System.out.println(m.group() + " start:" + m.start() + " end:" + m.end());
		}
	}
	
	static void ResetTest(){
		String[] mails = { "kongyee@163.com", "wang@abc.xxx", "ligang@crazy.com"};
		String mailRegEx = "\\w{3,20}@\\w+\\.(com|org)";
		Pattern mailPattern = Pattern.compile(mailRegEx);
		Matcher matcher = null;
		for (String mail : mails){
			matcher = Objects.isNull(matcher) ? mailPattern.matcher(mail) : matcher.reset(mail);
			System.out.printf("%s is effective mail: %s\n", mail, matcher.matches());
		}
	}
	
	static void lookingAtTest(){
		Pattern p = Pattern.compile("a\\wb");
		Matcher m = p.matcher("adddddfdfb");
		System.out.println(m.lookingAt());
		System.out.println(m.matches());
	}
	
	static void replaceTest(){
		Pattern p = Pattern.compile("a\\wb");
		Matcher m = p.matcher("awbtksfatbok?");
		System.out.println(m.replaceAll("hehe"));
		System.out.println(m.replaceFirst("hehe"));
	}
	
	static void split(){
		String msg = "java is very good.";
		System.out.println(Arrays.toString(msg.split("very")));
	}
}
