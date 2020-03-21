package genericb1;


public class AppStart {
	public static void main(String[]args) {
		//Course<Person> a=new Course<>("allType",10);
		//Course<Worker> b=new Course<>("allType",10);
		Course<Student> b=new Course<>("allType",10);
		Course<CollageStudent> c=new Course<>("allType",10);
		//c.add(new Student("hgd","math"));
		c.add(new CollageStudent("hgd","math",3));
		c.showLis();
	}
} 
