package annotation;

public @interface MyTag {
	String name() default "yek";
	int age() default 12;
}
