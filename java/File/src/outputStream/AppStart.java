package outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppStart {
	public static void main(String[]args) {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("c:/tmp/data.txt");
			fos.write(65);
			fos.write(66);
			fos.write(166);

		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}
			catch(IOException |NullPointerException e) {
				e.printStackTrace();
			}
		}
	}
}
