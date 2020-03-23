package ThreadTest12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Box{
	int number;
	
	public void add(int n) {
		this.number=n;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	
}
class MyBoxControll implements Runnable	{
	Box box;
	public MyBoxControll(Box box) {
		this.box=box;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			box.setNumber(box.getNumber()+i);
			try {
				Thread.sleep(100);
				
			}catch(InterruptedException e) {
				
			}
		}
	}

}
public class AppStart {
	public static void main(String[]args) {
		Box box=new Box();
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		for (int i=0;i<10;i++) {
			executorService.submit(new MyBoxControll(box));
		}
		executorService.shutdown();
		System.out.println(box.getNumber());
	}
}
//2
