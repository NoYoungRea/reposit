package ioioio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class Accessablego implements Accessable {
	public void saveSchoolSet(School school, String fileName) throws Exception {

		ObjectOutputStream a = null;
		FileOutputStream b = null;
		BufferedOutputStream c = null;
		try {
			b = new FileOutputStream(fileName);
			c = new BufferedOutputStream(b, 1024);
			a = new ObjectOutputStream(c);
			Iterator<Person> it = school.getSchool().iterator();
			Person p = null;
			while (it.hasNext()) {
				p = it.next();
				a.writeObject(p);
			}
			a.flush();
		} catch (EOFException e) {
			System.out.println("done");
		} 
		try {
			a.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void restoreSchool(School school, String fileName) throws Exception {
		ObjectInputStream a = null;
		FileInputStream b = null;
		BufferedInputStream c = null;
		try {
			b = new FileInputStream(fileName);
			c = new BufferedInputStream(b, 1024);
			a = new ObjectInputStream(c);

			while (true) {
				Person p = (Person) a.readObject();
				school.getSchool().add(p);

			}
		} catch (EOFException e) {
			System.out.println("done");
		} 
		try {
			a.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
