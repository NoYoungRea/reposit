package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class AppStart {
	public static void main(String[]args) {
		HashSet<Person> hs=new HashSet<>();
		hs.add(new Person("aa"));
		hs.add(new Person("bb"));
		hs.add(new Person("aa"));
		
		
		Iterator<Person> it=hs.iterator();
		String name="aa";

		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
