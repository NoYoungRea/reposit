package threadpractice;

public class Student implements Runnable{
	private String name;
	private Bakery bakery;
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
	}
	public Student( Bakery bakery,String name) {
		this.name = name;
		this.bakery = bakery;
	}
	public void run() {
		String bread=null;
		synchronized(bakery) {
			try {bakery.wait();}
			catch(InterruptedException e) {}
		}
		
		
		
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
	}
}
