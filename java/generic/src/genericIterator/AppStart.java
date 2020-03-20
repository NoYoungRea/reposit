package genericIterator;
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String toString() {
		return this.name;
	}
}
public class AppStart {
	public static void main(String[]args) {
		MyCollection<Integer> collection =new MyCollection<>(100);
		collection.add(100);
		collection.add(200);
		collection.add(300);
		
		Iterator<Integer> it=collection.iterator();
		while(it.hasNext()) {
			int value=it.next();
			System.out.println(value);
		}
		MyCollection<Person> collection1 =new MyCollection<>(100);
		collection1.add(new Person("hgd"));
		collection1.add(new Person("wee"));
		collection1.add(new Person("sdf"));
		Iterator<Person> it2=collection1.iterator();
		
		while(it2.hasNext()) {
			Person value=it2.next();
			System.out.println(value);
		}
		
	}
}
