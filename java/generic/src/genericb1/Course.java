package genericb1;

public class Course <T>{
	private T student;
	
	public Course(T student) {
		this.student=student;
	}
	public T getStudent() {
		return student;
	}
	public void show() {
		System.out.println(student.getName());
	}
}
