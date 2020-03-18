package hashCodeTest1;

public class AppStart {
	public static void main(String[]args) {
		Student s=new Student("hgd",20,"math",34.2);
		System.out.println(s.getClass().getName()+"@"+Integer.toHexString(s.hashCode()));
	}
}
