package ReaderWriter2;

import java.io.FileWriter;

public class AppStart {
	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			fw=new FileWriter("C:/temp/data.txt");
			String str="abcedfg";
			int pos=2;
			fw.write(str,1,str.length()-pos);
		}
	}
}


