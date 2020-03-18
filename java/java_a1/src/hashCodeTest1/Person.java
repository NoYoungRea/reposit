package hashCodeTest1;

public class Person {
	int x;
	int y;
	
	public Person(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int hashCode() {
		return x+y;
	}
}
