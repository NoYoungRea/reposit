import java.lang.reflect.Field;

class Person1{
	String name;
	int age;
	final int a=10;
}

public class A91_Reflaction {
	public static void main(String[]args) {
		Person1 p=new Person1();
		Class c=p.getClass();
		Field[] fs=c.getDeclaredFields();
		for(Field f:fs) {
			System.out.println(f.getModifiers()+" "+f.getName());
			System.out.println(f.toString());
		}
	}
}
