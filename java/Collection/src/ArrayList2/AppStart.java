package ArrayList2;

import java.util.LinkedList;

public class AppStart {
	public static void main(String[]args) {
		LinkedList<Person> persons=new LinkedList<>();
		persons.add(new Person("hgd"));
		persons.add(new Person("hsdf"));
		persons.add(new Person("hff"));
		persons.add(new Person("hgg"));
		
		if(persons.remove(new Person("hgd"))) {
			System.out.println("suscced");
		}
		else
			System.out.println("false");
		
		
		for(Person p:persons) {
			System.out.println(p);
		}
	}
}
