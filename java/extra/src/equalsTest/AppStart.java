package equalsTest;

public class AppStart {
	public static void main(String[] args) {
		Manager p1=new Manager(new Student("hgd",20,"math",30));
		Manager p2=new Manager(new Student("hgd",20,"math",30));
		Manager p3=p1;;
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

		
	}
}
