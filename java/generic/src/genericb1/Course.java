package genericb1;

public class Course <T>{
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
	
	public <K extends Student>void add(K student) {
		if (count<students.length) {
			System.out.println(student.getName()+" check");
			students[count++]=(T)student;
		}
	}
	private <K extends Student>void show(K obj) {
		System.out.println(obj.getName()+" : "+obj.getMajor());
	}

}
