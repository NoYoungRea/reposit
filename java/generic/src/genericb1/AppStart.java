package genericb1;

import java.util.Arrays;

public class AppStart {
	static void showListPerson(Course<?> course){
		Arrays.toString(course.getStudents());
	}
	public static void showListStudent(Course<? extends Student>course) {
		Arrays.toString(course.getStudents());
	}
	public static void showListCollageStudent(Course<? extends CollageStudent>course) {
		Arrays.toString(course.getStudents());
	}
	public static void showListWorker(Course<? extends Worker>course) {
		Arrays.toString(course.getStudents());
	}
	public static void main(String[]args) {
		Course<Person> personCourse =new Course<>("all",10);
		Course<Student> studentCourse=new Course<> ("student",10);
		Course<CollageStudent> collageSturdnet =new Course("collageStudent",10);
		Course<Worker> workerCourse=new Course<>("worker",10);
		
		showListPerson(personCourse);
		showListPerson(studentCourse);
		showListPerson(collageSturdnet);
		showListPerson(workerCourse);
		
		//showListStudent(personCourse);//
		showListStudent(studentCourse);
		showListStudent(collageSturdnet);
		//showListStudent(workerCourse);//
		
		//showListCollageStudent(personCourse);
		//showListCollageStudent(studentCourse);
		showListCollageStudent(collageSturdnet);
		//showListCollageStudent(workerCourse);
		
		//showListWorker(personCourse);
		//showListWorker(studentCourse);
		//showListWorker(collageSturdnet);
		showListWorker(workerCourse);
		
	}
} 
