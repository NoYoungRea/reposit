package buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BufferOut {
	public static void main(String[]args) {
		ObjectOutputStream ois=null;
		try {
			ois=new ObjectOutputStream(new BufferedOutputStream(System.out,1024));
			ois.writeInt(10);
			ois.writeDouble(3.14);
			ois.writeObject("shdudfo");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
