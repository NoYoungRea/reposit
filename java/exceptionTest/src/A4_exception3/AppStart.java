package A4_exception3;

import java.io.FileInputStream;
import java.io.IOException;

public class AppStart {
	public static void func() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data.txt");
		}

		catch (IOException e) {
			System.out.println("x");

		}
		finally {
			try {

				fis.close();

			} 
			catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		func();
	}
}