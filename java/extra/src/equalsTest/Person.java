package equalsTest;

public abstract class Person {
	protected String name;
	protected int age;

	public Person(String name, int age) {
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

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Person))// this.getClass().getName().equals(obj.getClass().getName())
			return false;
		Person o = (Person) obj;
		if (this.name != null) {
			if (o.name == null)
				return false;

			else {
				if (!this.name.contentEquals(o.name))
					return false;
			}
		}
		else {
			if(o.name!=null) {
				return false;
			}
		}
		if(this.age!=o.age)
			return false;
		return true;
	}
	public abstract String getDescript();

}
