package transientTest;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectIn {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in= new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:/tmp/data.txt")));

		while(true) {
			try {
				Object obj=in.readObject();
				if(!(obj instanceof Box)) {
					throw new Exception();
				}
				Box box=(Box)obj;
				System.out.println(box);
			}catch(EOFException e) {
				break;
			}catch(Exception e	) {
				System.out.println("is not Box");
			}
	
		}
		System.out.println("done");
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception e) {
			}
		}
	}
}
