package fileinputstream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppStart {
	public static void main(String[]args) {
		File f=null;
		FileInputStream fis=null;
		DataInputStream dis=null;
		
		try {
			f=new File("c:/tmp/data.txt");
			fis = new FileInputStream(f);
			dis=new DataInputStream(fis);
			
	
			double d=dis.readDouble();
			char e=dis.readChar();
			System.out.println(d);
			System.out.println(e);


		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(EOFException e) {
			e.printStackTrace();

		}
		catch(IOException e) {
			e.printStackTrace();

		}
		finally {
			try {
				dis.close();
			}
			catch(Exception e)
			{
				
			}
			
		}
	}
}
