package TreeTest;

import java.util.TreeSet;

public class AppStart {
	public static void main(String[]args) {
		TreeSet<Person>ts=new TreeSet<>();
		ts.add(new Person("a"));
		ts.add(new Person("b"));
		ts.add(new Person("c"));
		ts.add(new Person("d"));
		ts.add(new Person("e"));

		for(Person i:ts) {
			System.out.println(i);
			
		}
	}
}
