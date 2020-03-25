package buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BufferIn {
	public static void main(String[]args) {
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("c:/tmp/data.txt"),1024));
			
			int i=ois.readInt();
			double d= ois.readDouble();
			String s=(String)ois.readObject();
			
			System.out.println(i);
			System.out.println(d);
			System.out.println(s);
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
