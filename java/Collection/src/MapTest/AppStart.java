package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AppStart {
	public static void main(String[]args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1, "hgd");
		hm.put(2, "asd");
		hm.put(3, "dfk");
		hm.put(3,"aaa");
		
		Set<Integer>keys=hm.keySet();
		Iterator<Integer>keyIterator=keys.iterator();
		while(keyIterator.hasNext()) {
			System.out.println(keyIterator.next());
			System.out.println(hm.get(keyIterator.next()));
		}
		
		Set<Map.Entry<Integer,String>> entrySet=hm.entrySet();
		
		
		if(hm.containsKey(1)) {
			System.out.println(hm.get(1));
		}
		else
			System.out.println("we didn't have that key");
		
		String value=hm.get(4);
		if(value!=null) {
			System.out.println(value);
		}
		else
			System.out.println("we didn't have that key");
		
	}
}
