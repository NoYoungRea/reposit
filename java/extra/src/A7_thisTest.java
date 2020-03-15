class Person{
	String name;
	int gender;
	
	public Person() {

		this.name="nonmae";
		this.gender=10;

	}
	public Person(String name) {
		this();
		this.name=name;
	}
	public Person(String name,int gender) {
		this(name);
		this.gender=gender;
	}

}
public class A7_thisTest {
	public static void main(String[]args) {
		Person p=new Person();
	}
}
