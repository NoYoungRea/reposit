package ReaderWriter2;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean equals(Object o) {
		if (o == null) return false;
		if (!this.getClass().getName().equals(o.getClass().getName())) return false;
		Person obj = (Person)o;
		if (this.name != null) {
			if (!this.name.equals(obj.name)) return false;
		}
		else {
			if (obj.name != null) return false;
		}
		if (this.age != obj.age) return false;
		return true;
	}
}
