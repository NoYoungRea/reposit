package ioioio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class School {
	private HashSet<Person> school;
	private Accessable accessable;

	public HashSet<Person> getSchool() {
		return school;
	}

	public Accessable getAccessable() {
		return accessable;
	}

	public void setAccessable(Accessable accessable) {
		this.accessable = accessable;
	}

	public void setSchool(Set<Person> school) {
		this.school = new HashSet<Person>(school);
	}

	public void addPerson(Person person) {
		school.add(person);
	}

	public void addPerson(String name, int age) {
		school.add(new Person(name, age));
	}

	public Person findPerson(String name) {
		Iterator<Person> it = school.iterator();
		Person p = null;
		while (it.hasNext()) {
			p = it.next();
			if (p.getName() == name) {
				return p;
			}
		}
		return null;

	}

	public boolean removePerosn(String name) {
		Person p = findPerson(name);
		if (p == null)
			return false;
		else {
			school.remove(p);
			return true;

		}

		// return this.school.remove(findPerson(name));
	}

	public void clear() {
		school.clear();
	}

	public void saveFile(String fileName) {

		try {
			this.accessable.saveSchoolSet(this, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void restoreFile(String fileName) {

		try {
			this.accessable.restoreSchool(this, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void showList() {
		System.out.println("current student:" + school.size());
		Iterator<Person> p = school.iterator();
		while (p.hasNext()) {
			Person person = p.next();
			System.out.println(person.getName() + "/" + person.getAge());
		}
	}

}
