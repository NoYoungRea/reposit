package ioioio;

import java.io.Serializable;

public class Person implements Serializable{
	
	public final static long serialVersionUID=1L;
	private String name;
	private int age;
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object o) {
		if(o==null)return false;
		if(this.getClass().getName().equals(o.getClass().getName()))return false;
		if(this.name!=null) {
			if(!this.name.equals(((Person)o).name))return false;
		}
		else {
			if(((Person)o).name!=null)return false;
			
		}
		if(this.age!=((Person)o).age)return false;
		return true;
	}
	
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+(this.name!=null?this.name.hashCode():0);
		result=prime*result+this.age;
		return result;
	}
	

}
