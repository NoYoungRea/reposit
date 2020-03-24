package ThreadTest2;

import java.util.HashSet;
import java.util.Iterator;

public class Bakery {
	private HashSet<String> warmmer;

	public Bakery() {
		warmmer = new HashSet<>();
	}

	public synchronized void add(String bread) {
		warmmer.add(bread);
	}

	public String getBread() {
		String bread = null;
		synchronized (this) {
			if (warmmer.size() > 0) {
				try {
					Iterator<String> it = warmmer.iterator();
					if (it.hasNext()) {
						bread = it.next();
						warmmer.remove(bread);
					}
				} catch (Exception e) {
					System.out.println("exception");
				}
				
			}
		}
		return bread;
	}
}
