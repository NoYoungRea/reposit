package genericb1;

public class Course <T extends Student>{
	private String courseName;
	private T[]students;
	private int count;
	
	public Course(String courseName, int capacity) {
		students=(T[])(new Student[capacity]);
		this.courseName=courseName;
		this.count=0;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}
	
	public void add(T student) {
		if (count<students.length) {
			students[count++]=student;
		}
	}
	public void showLis() {
		
		for(T obj:students) {
			if(obj==null) {
				break;
			}
			System.out.println(obj.getName()+" "+obj.getMajor());
			
			
		}
	}

}
