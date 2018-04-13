package enumtest;

public enum YetAnotherGender implements GenderDesc {
	MAlE("man") {
		@Override
		public void info() {

			System.out.println("man info");
		}
	},
	FEMAlE("woman") {
		@Override
		public void info() {
			System.out.println("woman info");
		}
	};
	private final String name;

	YetAnotherGender(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
