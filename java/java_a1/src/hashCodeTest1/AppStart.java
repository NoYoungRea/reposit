package hashCodeTest1;

public class AppStart {
	public static void main(String[]args) {
		Person p1=new Person(10,100);
		Person p2=new Person(100,10);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
