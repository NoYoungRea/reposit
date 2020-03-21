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
	
	public void add(T obj) {
		try {
			if(count==students.length) {
				throw new FullException();
			}
			this.students[count++]=obj;

		}
		catch(CourseException e) {
			System.out.println(e.getMessage());
			e.doExcept(this);
			this.add(obj);
		}

		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}



}
