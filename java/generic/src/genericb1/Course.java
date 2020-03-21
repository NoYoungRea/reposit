package genericb1;

public class Course <T extends Person>{
	private String courseName;
	private T[]students;
	private int count;
	
	public Course(String courseName, int capacity) {
		students=(T[])(new Object[capacity]);
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
			if(obj instanceof CollageStudent) {
	
			}
			else if(obj instanceof Student) {
				
			}
			else if(obj instanceof Worker) {
				
			}
			else if(obj instanceof Person) {	
			
		}
			
		}
	}

}
