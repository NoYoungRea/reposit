package objectinout;

import java.io.Serializable;

public class Person implements Serializable{
	
	public static final long serialVersionUID=1L;
	
	private int age;
	private String name;
	public Person(int age, String name) {
		super();
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
}
