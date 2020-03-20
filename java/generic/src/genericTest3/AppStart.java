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
	Map<String,String> map =new Map<String,String>("1","hgd");
}
