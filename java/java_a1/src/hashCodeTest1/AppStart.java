package hashCodeTest1;

public class AppStart {
	public static void main(String[]args) {
		Person p1=new Person("hgd",20);
		Person p2=new Person("hgd",20);
		Person p3=new Person("hgd",30);
		Person p4=new Person("hgs",20);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p1==p4);
		
	}
}
