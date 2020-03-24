package TreeTest;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	
	public int compare(Person a,Person b) {
		return Integer.valueOf(a.sum().compareTo(b.sum()));
	}
}
