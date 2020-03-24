package ThreadTest2;

public class Student implements Runnable{
	private String name;
	private Bakery bakery;
	private Thread next;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bakery getBakery() {
		return bakery;
	}
	public void setBakery(Bakery bakery) {
		this.bakery = bakery;
		this.next=next;
	}
	public Student( Bakery bakery,String name,Thread next) {
		this.name = name;
		this.bakery = bakery;
		this.next=next;
	}
	public void run() {

		String bread=null;
		bread=bakery.getBread();
		if(bread!=null) {
			System.out.println(name+"/is pickup/"+bread);
		}
		else {
			System.out.println("give me a bread");
		}
		synchronized(bakery) {
			bakery.notify();
		}
		
		try {
			next.start();
		}
		catch(NullPointerException e) {
			System.out.println("last Thread");
		}
	}
}
