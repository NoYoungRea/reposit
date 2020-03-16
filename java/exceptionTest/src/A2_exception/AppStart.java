package A2_exception;

import java.io.IOException;

public class AppStart {
	public static void main(String[] args) {
		try {
			int n = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
