

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class ClassTest {
	public static void main(String[]args) {
		Person p=new Person();
		Class cp=p.getClass();
		
		
		Class cls=null;
		try {
		cls=Class.forName("Scanner");

	
		}
		catch(ClassNotFoundException e) {
			System.out.println("x");
		} 
		System.out.println("o");

	}
}
