package genericHospital;

public class AppStart {
	public static void main(String[]args) {
		Animal a=new Cat("cat1");
		Animal b=new Dog("dog1");
		Animal c=new Cat("cat2");
		
		Hospital h=new AnimalHospital(5);
		h.cure(a);
		h.cure(b);
	}
}
