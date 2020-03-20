package genericfinal;

class Person<K,V>{
	private K name;
	private V jumsu;
	
	public Person(K name, V jumsu) {
		this.name=name;
		this.jumsu=jumsu;
	}

	public K getName() {
		return name;
	}

	public void setName(K name) {
		this.name = name;
	}

	public V getJumsu() {
		return jumsu;
	}

	public void setJumsu(V jumsu) {
		this.jumsu = jumsu;
	}
	
}

public class AppStart {
	public static<K,V> Person<K,V> func(K name,V jumsu) {
		Person<K,V> person = new Person<>(name,jumsu);
		return person;
	}
	public static void main(String[]args) {
		Person<String, Integer> person=AppStart.<String,Integer>func("hgd",100);
		System.out.println(person.getName()+" : "+person.getJumsu());
	}
}
