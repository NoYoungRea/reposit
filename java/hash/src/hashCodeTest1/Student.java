package hashCodeTest1;

public class Student extends Person{
	String major;
	double jumsu;
	
	public Student(String name, int age,String major,double jumsu) {
		super(name,age);
		this.major=major;
		this.jumsu=jumsu;
	}
	
	public int hashCode() {
		int prime=31;
		int hash=1;
		hash+=super.hashCode();
		hash+=prime*hash+(major==null?0:major.hashCode());
		hash+=prime*hash+(new Double(jumsu).hashCode());
		return hash;
	}
	public void finalize() {
		System.out.println("S");
	}
}
