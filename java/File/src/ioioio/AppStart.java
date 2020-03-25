package ioioio;

import java.util.HashSet;

public class AppStart {
	public static void main(String[]args) {
		HashSet<Person> hs=new HashSet<>();
		hs.add(new Person("aa",20));
		hs.add(new Person("bb",30));
		School school=new School();
		
		
		school.setSchool(hs);
		school.showList();
		school.setAccessable(new Accessablego());
		
		school.saveFile("c:/tmp/data.txt");
		school.clear();
		school.showList();
		school.restoreFile("c:/tmp/data.txt");
		school.showList();
	}
}
