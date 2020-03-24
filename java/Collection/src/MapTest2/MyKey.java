package MapTest2;

import ArrayList2.Person;

public class MyKey {
	private int Key;

	public MyKey(int key) {
		super();
		Key = key;
	}

	public int getKey() {
		return Key;
	}

	public void setKey(int key) {
		Key = key;
	}
	public boolean equals(Object o) {
		if(o==null) {
			return false;
		}
		if(this.getClass().getName()!=o.getClass().getName())
			return false;
		if(this.Key!=((MyKey)o).Key) return false;
		
		return true;
	}
	public int hashCode() {
		final int prime=31;
		int code=1;
		code=prime*code+this.Key;
		return code;
	}
}
