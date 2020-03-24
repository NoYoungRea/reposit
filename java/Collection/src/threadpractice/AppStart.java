package threadpractice;

public class AppStart {
	public static void main(String[]args) {
		Bakery bakery =new Bakery();
		bakery.add("a");
		bakery.add("b");
		bakery.add("c");
		
		Thread[] students=new Thread[] {
				new Thread(new Student(bakery,"a")),
				new Thread(new Student(bakery,"b")),
				new Thread(new Student(bakery,"c")),
				new Thread(new Student(bakery,"d")),
				
		};
		
		for(Thread t :students) {
			t.start();
			
		}
		
		while(true) {
			boolean isReadyAll=true;
		
			for(Thread t: students) {
				if(t.getState()!=Thread.State.WAITING	) {
					isReadyAll=false;
					break;
				}
			}
			if(isReadyAll) {
				break;
			}
		}
		
		synchronized(bakery) {
			bakery.notify();
		}
	}
}
