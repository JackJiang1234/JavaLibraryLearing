package enumtest;

public class EnumTest {

	public static void main(String[] args) {
		seasonTest();
		genderTest();
		yetAnotherGenderTest();
		operationTest();
	}

	public static void operationTest() {
		System.out.println(Operation.ADD.eval(10, 20));
	}

	public static void yetAnotherGenderTest() {
		System.out.println(YetAnotherGender.FEMAlE);
		YetAnotherGender.FEMAlE.info();
	}

	public static void genderTest() {
		System.out.println(Gender.FEMAlE);
		System.out.println(Gender.FEMAlE.getName());
		Gender.MAlE.info();
	}

	public static void seasonTest() {
		System.out.println(Season.FALL);
		System.out.println(Season.FALL.name());
		System.out.println(Season.FALL.ordinal());
		System.out.println(Season.FALL.toString());
		System.out.println(Season.SPRING.ordinal());

		Season[] values = Season.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		System.out.println(Season.valueOf("WINTER"));

		Season s = Enum.valueOf(Season.class, "FALL");
		System.out.println(s);

		switch (s) {
		case SPRING:
			System.out.println(s);
			break;
		default:
			System.out.println("not match");
			break;
		}
	}

}
