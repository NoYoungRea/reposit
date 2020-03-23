package ThreadTest11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class AppStart {
	public static void main(String[]args) {
		ExecutorService excutorService=Executors.newFixedThreadPool(2);
		for(int i=0;i<10;i++) {
			Future<Integer> future=excutorService.submit(new Callable<Integer>() {
				public Integer call() {
					int sum=0;
					for(int i=0;i<10;i++) {
						sum+=i;
					}
					return sum;
				}
			});
			try {
				int result=future.get();
				System.out.println(result);
			}
			catch(InterruptedException|ExecutionException e) {}

		}
		
	}
}
