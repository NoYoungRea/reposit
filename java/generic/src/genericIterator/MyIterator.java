package genericIterator;

public class MyIterator<T> implements Iterator<T>{
	
	private MyCollection<T> collection;
	private int cursor;
	
	public MyIterator(MyCollection<T> collection) {
		this.collection=collection;
		cursor=0;
	}
	public boolean hasNext() {
		return (cursor<collection.getCount());
	}
	public T next() {
		return collection.getAt(cursor++);
	}
}
