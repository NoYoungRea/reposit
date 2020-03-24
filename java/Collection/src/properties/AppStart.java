package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class AppStart {
	public static void main(String[]args) {
		Properties config=new Properties();
		FileReader fr=null;
		
		try {
			fr=new FileReader("data.txt");
			config.load(fr);
			
			Enumeration<String> names=(Enumeration<String>)config.propertyNames();
			while(names.hasMoreElements()) {
				String key=(String)names.nextElement();
				System.out.println(key);
			}
			
			System.out.println(config.getProperty("email"));
		}
		catch(FileNotFoundException e) {
			System.out.println("file isn't ");	
		}
		catch(IOException e) {
			System.out.println("when read it somthing happen");
		}
		finally {
				
		}
	}
}
