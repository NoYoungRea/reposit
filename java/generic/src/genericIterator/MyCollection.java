package genericIterator;

public class MyCollection<T> implements Collection{
	private T[] base;
	private int count;
	
	public MyCollection(int capacity) {
		base=(T[])(new Object[capacity]);
		count=0;
	}
	public int getCount() {
		return count;
	}
	public void add(T value) {
		base[count++]=value;
	}
	public T getAt(int index) {
		return base[index];
	}
	public Iterator<T> iterator(){
		return new MyIterator<T>(this);
	}
}
