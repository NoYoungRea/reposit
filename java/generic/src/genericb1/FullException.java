package genericb1;

public class FullException extends CourseException{
	public FullException() {
		super("it is full");
		
	}
	public <T>void doExcept(Course<T> course) {
		int newCount=course.getCount()+1;
		T[] students=(T[])(new Object[newCount]);
		System.out.println(newCount);
		System.arraycopy(course.getStudents(), 0, students, 0, course.getCount());
		course.setStudents(students);
	}
}
