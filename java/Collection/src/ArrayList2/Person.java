package ArrayList2;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.getClass().getName()+"/"+name;
	}
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(this.getClass().getName()!=obj.getClass().getName())
			return false;
		Person o=((Person)obj);	
		
		if(name!=null) {
			if(!name.equals(o.name))return false;
		}
		else
			if(o.name!=null)return false;
		return true;
		
	}
}
