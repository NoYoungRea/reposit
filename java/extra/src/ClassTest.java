

import java.util.Comparator;
import java.util.Objects;


public class ClassTest {
	public static void main(String[]args) {
		Person p=new Person();
		Class cp=p.getClass();
		
		
		Class cls=null;
		try {
		cls=Class.forName("Person");
		Person p1=(Person) cls.newInstance();
	
		}
		catch(ClassNotFoundException e) {
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
