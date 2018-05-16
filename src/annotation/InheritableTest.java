package annotation;

import java.lang.annotation.Annotation;

@Testable
class Base{
	
}

public class InheritableTest extends Base {

	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println(InheritableTest.class.isAnnotationPresent(Testable.class));
		
		Annotation[] arr = InheritableTest.class.getAnnotations();
		for(Annotation an : arr){
			System.out.println(an);
		}
	}

}
