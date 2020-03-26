package ReaderWriter2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AppStart {
	public static void main(String[] args) {
		List<Person> student=new ArrayList<>();
		student.add(new Person("a",20));
		student.add(new Person("b",30));
		student.add(new Person("b",40));
		FileWriter fw = null;
		PrintWriter out=null;
		BufferedWriter bw=null;
		try{
			fw=new FileWriter("C:/tmp/data.txt");
			bw=new BufferedWriter(fw);
			out=new PrintWriter(bw);
			for(Person t:student) {
				out.printf("%s:%d\n", t.getName(),t.getAge());
			}
			out.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
		
	}
}


