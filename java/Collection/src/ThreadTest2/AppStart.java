package ThreadTest2;

public class AppStart {
	public static void main(String[]args) {
		Bakery bakery =new Bakery();
		bakery.add("a");
		bakery.add("b");
		bakery.add("c");
		
		Thread t=new Thread(new Student(bakery,"hgd",null));
		Thread t2=new Thread(new Student(bakery,"asd",t));
		Thread t3=new Thread(new Student(bakery,"sdf",t2));
		Thread t4=new Thread(new Student(bakery,"gfg",t3));
		

		t4.start();
		
		System.out.println("main is done");	
	}
}
