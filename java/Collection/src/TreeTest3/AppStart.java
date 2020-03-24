package TreeTest3;

import java.util.Comparator;
import java.util.TreeSet;

public class AppStart {
	public static void main(String []args) {
		TreeSet<Person> ts=new TreeSet<>(
				new Comparator<Person>() {
					public int compare(Person a,Person b) {
						return b.getName().compareTo(a.getName());
					}
				});
		ts.add(new Person("a"));
		ts.add(new Person("b"));
		ts.add(new Person("c"));
		ts.add(new Person("d"));
		ts.add(new Person("e"));
		

		for(Person p:ts) {
			System.out.println(p);
		}
	}
}
