package hashCodeTest1;

public class Person {
	int x;
	int y;
	
	public Person(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int hashCode() {

		int prime=31;
		int hash=1;
		hash=prime*hash+x;
		hash=prime*hash+y;
		return hash;
	}
}
