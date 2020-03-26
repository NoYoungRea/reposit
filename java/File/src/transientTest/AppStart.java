package transientTest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AppStart {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("C:/tmp/data.txt")));
			out.writeObject(new Box(10, 10));
			out.writeObject(new Box(13, 19));
			out.writeObject(new Box(15, 12));
			out.flush();
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e) {
			}
		}
	}
}
