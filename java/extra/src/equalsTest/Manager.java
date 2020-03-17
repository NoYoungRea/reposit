package equalsTest;

public class Manager {
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Manager(Student student) {
		this.student=student;
	}
	public boolean equals(Object o) {
		if(o==null) {
			return false;
		}
		else {
			if(!(o instanceof Manager))
				return false;
			Manager obj=(Manager)o;
			if(student!=null) {
				if(!student.equals(obj.student))
				return false;
				}
			else {
				if(obj.student!=null)
					return false;
			}	
		
			return true;
		}
	}
}
