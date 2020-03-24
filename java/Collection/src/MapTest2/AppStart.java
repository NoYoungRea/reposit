package MapTest2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AppStart {
	public static void main(String[]args) {
		HashMap<MyKey,MyValue>hm=new HashMap<>();
		hm.put(new MyKey(1),new MyValue("a"));
		hm.put(new MyKey(2),new MyValue("b"));
		hm.put(new MyKey(3),new MyValue("c"));
		hm.put(new MyKey(3),new MyValue("d"));
		
		Set<Map.Entry<MyKey,MyValue>>entrySet=hm.entrySet();
		Iterator<Map.Entry<MyKey,MyValue>>it= entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<MyKey,MyValue> entry = it.next();
			System.out.println(entry.getKey().getKey()+" / "+entry.getValue().getValue());
		}
	}
}
