package genericb1;

public class Student extends Person {
	public static final String TYPE="normalStudent";
	protected String major;
	
	public Student(String name,String major) {
		super(name);
		this.major=major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
		return name+"/"+major;
	}
	
}
