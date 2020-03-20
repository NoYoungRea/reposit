package genericHospital;

public class AnimalHospital<T> extends Hospital<T>{
	private T rooms[];
	private int count;
	
	public AnimalHospital(int size) {
		super("animalHospital");
		rooms=(T[])(new Object[size]);
		count=0;
	}
	
	public void showList() {
		for(T obj:rooms) {
			System.out.println(obj);
		}
	}
	public T cure(T obj) {
		System.out.println("from "+name+"/"+obj+"checkIn");
		rooms[count++]=obj;
		
		return null;
	}
}
