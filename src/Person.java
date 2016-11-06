
public class Person {
	private int age;
	private String name;
	private boolean man;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMan() {
		return man;
	}

	public void setMan(boolean man) {
		this.man = man;
	}
	
}