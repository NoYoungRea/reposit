package TreeTest2;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class AppStart {
	public static void main(String[]args) {
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(100,"a");
		map.put(90,"s");
		map.put(80,"d");
		map.put(60,"n");
		map.put(50,"w");
		
		Set<Integer>keySet=map.keySet();
		Iterator<Integer>keyIt=keySet.iterator();
		while(keyIt.hasNext()) {
			int key=keyIt.next();
			System.out.println(map.get(key)+"//"+key);
			
		}
		System.out.println("------------------------------");
		
		NavigableSet<Integer>keySet2=map.descendingKeySet();
		Iterator<Integer>keyIt2=keySet2.iterator();
		while(keyIt2.hasNext()) {
			int key=keyIt2.next();
			System.out.println(map.get(key)+"//"+key);
			
		}

		System.out.println("------------------------------");
		NavigableMap<Integer,String>nmap=map.descendingMap();
		Set<Integer> keys2=nmap.keySet();
		Iterator<Integer> nIter2=keys2.iterator();
		while(nIter2.hasNext()) {
			int key=nIter2.next();
			System.out.println(map.get(key)+"//"+key);
			
		}
		

	}
}
