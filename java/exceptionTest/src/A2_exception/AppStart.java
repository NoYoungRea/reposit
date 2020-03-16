package A2_exception;

import java.io.IOException;

public class AppStart {
	public static void main(String[] args) {
		int n=0;
		try {
			System.out.print("input:");
			n=System.in.read();
			int a=10/0;

		}

		catch(IOException e) {
			System.out.println("read");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("math");
			e.printStackTrace();
		}
		catch (Exception e) {
			//all of them is cetched by here except above two
		}
		finally {
			System.out.println(n);
		}
	}
}

