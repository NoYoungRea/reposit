package hashCodeTest1;

public class Person {
	String name;
	int age;

	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}

	public int hashCode() {

		int prime = 31;
		int hash = 1;
		hash = prime * hash + (name==null?0:name.hashCode());
		hash = prime * hash + age;
		return hash;
	}
	public void finalize() {
		System.out.println("S");
	}

}
