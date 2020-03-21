package genericb1;

import java.util.Arrays;

public class AppStart {
	static void showListPerson(Course<? super Person> course){
		Arrays.toString(course.getStudents());
	}
	public static void showListStudent(Course<? super Student>course) {
		Arrays.toString(course.getStudents());
	}
	public static void showListCollageStudent(Course<? super CollageStudent>course) {
		Arrays.toString(course.getStudents());
	}
	public static void showListWorker(Course<? super Worker>course) {
		Arrays.toString(course.getStudents());
	}
	public static void main(String[]args) {
		Course<Student> course =new Course<>("student",2);
		course.add(new Student("abd","math"));
		course.add(new CollageStudent("abd","math",3));	
		course.add(new Student("abdd","math"));
		course.add(new CollageStudent("abdb","math",3));	
		System.out.println(Arrays.toString(course.getStudents()));
		
		
	}
} 
