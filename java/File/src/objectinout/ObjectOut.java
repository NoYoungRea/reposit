package objectinout;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOut {
	public static void main(String[]args) {
		ObjcetFile file=null;
		ObjectOutputStream oos=null;
		
		try {
			file=new ObjcetFile("C:/tmp/data.txt");
			oos=new ObjectOutputStream(new FileOutputStream(file.getFile()));
			oos.writeInt(100);
			oos.writeChar('a');
			oos.writeDouble(3.14);
			oos.writeObject("java");
			oos.writeObject(new Person(20,"hgd"));
			System.out.println("file exit ok!");
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
