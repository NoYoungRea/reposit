package equalsTest;

public class AppStart {
	public static void main(String[] args) {
		Person p1=new Person("hgd",20);
		Person p2=new Person("hgd",20);
		Person p3=p1;;
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
