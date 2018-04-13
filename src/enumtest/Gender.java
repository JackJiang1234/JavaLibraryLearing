package enumtest;

public enum Gender implements GenderDesc {
	MAlE("man", 10), FEMAlE("woman", 11);
	private final String name;
	private final int age;

	Gender(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString(){
		return String.format("name=%s,age=%s", this.name, this.age);
	}

	@Override
	public void info() {
		System.out.println(this.toString());
	}
}
