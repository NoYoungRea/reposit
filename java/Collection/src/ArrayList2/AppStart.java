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
		
		for(int i=0;i<persons.size();i++) {
			Person rp=persons.remove(i);
			System.out.println(rp+"/delete");
		}		
	}
}
