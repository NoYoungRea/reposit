package genericb1;

public final class CollageStudent extends Student{
	public final static String TYPE="collageStudent";
	
	private int grade;
	
	public CollageStudent(String name,String major,int grade) {
		super(name,major);
		this.grade=grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
