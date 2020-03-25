package objectinout;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class InputFile {
	public static void main(String[]args) {
		ObjcetFile file=null;
		ObjectInputStream oos=null;
		try {
			file=new ObjcetFile("C:/tmp/data.txt");
			oos=new ObjectInputStream(new FileInputStream(file.getFile()));
			int i=oos.readInt();
			char b=oos.readChar();
			double c=oos.readDouble();
			String d=(String)oos.readObject();
			Person f=(Person)oos.readObject();

			System.out.println(i);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(f.getAge()+"/"+f.getName());

			

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			oos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
