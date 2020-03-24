package TreeTest;

import java.util.TreeSet;

public class AppStart {
	public static void main(String[]args) {
		TreeSet<Person>ts=new TreeSet<>();
		ts.add(new Person("a",90,90,80));
		ts.add(new Person("b",25,53,67));
		ts.add(new Person("c",15,78,100));
		ts.add(new Person("d",568,34,21));
		ts.add(new Person("e",46,13,56));

		for(Person i:ts) {
			System.out.println(i);
			
		}
	}
}
