package ArrayList2;

import java.util.ArrayList;

public class AppStart {
	public static void main(String[]args) {
		ArrayList<Person> persons=new ArrayList<>();
		persons.add(new Person("hgd"));
		persons.add(new Person("hsdf"));
		persons.add(new Person("hff"));
		persons.add(new Person("hgg"));
		
		for(Person p:persons) {
			System.out.println(p);
		}
	}
}
