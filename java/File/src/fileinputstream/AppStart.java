package fileinputstream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AppStart {
	public static void main(String[] args) {
		File f = null;
		FileInputStream fis = null;
		ObjectInputStream dis = null;

		try {
			f = new File("c:/tmp/data.txt");
			fis = new FileInputStream(f);
			dis = new ObjectInputStream(fis);

			double d = dis.readDouble();
			char e = dis.readChar();
			String f1 = (String) dis.readObject();
			System.out.println(d);
			System.out.println(e);
			System.out.println(f1);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (Exception e) {

			}

		}
	}
}
