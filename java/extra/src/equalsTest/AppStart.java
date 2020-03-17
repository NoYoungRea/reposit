package equalsTest;

public class AppStart {
	public static void main(String[] args) {

		Student s=new Student("gd",20,"math",30);
		Person p=new Student("gd",20,"math",30);
		Object o=new Student("gd",20,"math",30);

		System.out.println(s.equals(p));
		System.out.println(o.equals(s));
		
	}
}
