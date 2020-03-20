package genericTest3;
class Map<K,V>{
	private K key;
	private V value;
	
	public Map(K key, V value) {
		this.key=key;
		this.value=value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
public class AppStart {
	public static void main(String[]args) {
	Map<Number,String> map =new Map<>(3.14,"hgd");
	System.out.println(map.getKey()+" "+map.getValue());
	}
}
