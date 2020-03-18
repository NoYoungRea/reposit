package hashCodeTest1;

public class Person {
	int number;
	
	public Person(int number) {
		this.number=number;
	}
	
	public int hashCode() {
		return number;
	}
}
