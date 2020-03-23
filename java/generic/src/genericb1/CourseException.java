package genericb1;

public abstract class CourseException extends Exception {
	public CourseException(String name) {
		super(name);
	}
	public abstract <T> void doExcept(Course<T> course);
}
