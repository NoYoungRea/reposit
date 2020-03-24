package ArrayList2;

import java.util.Iterator;
import java.util.LinkedList;

public class AppStart {
	public static void main(String[]args) {
		LinkedList<Person> persons=new LinkedList<>();
		persons.add(0,new Person("hgd"));
		persons.add(0,new Person("hsdf"));
		persons.add(0,new Person("hff"));
		persons.add(0,new Person("hgg"));
		
		Iterator<Person> it=persons.descendingIterator();
		
		while(!persons.isEmpty()) {
			Person rp=persons.remove(0);
			System.out.println(rp+"/delete");
		}		
	}
}
