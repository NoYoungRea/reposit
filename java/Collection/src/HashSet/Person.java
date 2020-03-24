package HashSet;


public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	public boolean equals(Object o) {
		if(o == null) return false;
		if(!this.getClass().getName().equals(o.getClass().getName())) return false;
		if(this.name != null) {
			if(!this.name.equals(((Person)o).name)) return false;
		}
		else {
			if(((Person)o).name != null) return false;
		}
		return true;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.name == null ? 0 : this.name.hashCode());
		return result;
	}

}
