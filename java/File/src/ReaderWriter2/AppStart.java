package ReaderWriter2;

import java.io.FileWriter;
import java.io.PrintWriter;

public class AppStart {
	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter out=null;
		try{
			fw=new FileWriter("C:/tmp/data.txt");
			out=new PrintWriter(fw);
			out.println(100);
			out.println(3.14);
			out.println("hello");
			out.printf("%d:%.2f:%s\n",100,3.14,"hello");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
		
	}
}


