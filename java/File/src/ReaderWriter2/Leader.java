package ReaderWriter2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Leader {
	public static void main(String[]args) {
		BufferedReader in=null;
		StringTokenizer a=null;
		try {
			in=new BufferedReader(new FileReader("C:/tmp/data.txt"),1024);
			while(true) {
				String line=in.readLine();
				if(line==null){
					break;
				}
				a=new StringTokenizer(line,":");
				if(a.countTokens()!=2) {
					System.out.println("there are some problem");
				}
				else {
					String name=a.nextToken();
					int age=Integer.parseInt(a.nextToken());	
					System.out.println("name/"+name+" : "+"age/"+age);
				}

			}
		}catch(NumberFormatException e) {
			System.out.println("there are some probelm from parsein");
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{in.close();}catch(Exception e) {}
		}
	}
}
