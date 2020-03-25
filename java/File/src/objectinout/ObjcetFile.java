package objectinout;

import java.io.File;

public class ObjcetFile {
	private File file;
	public ObjcetFile(String fileName)throws Exception{
		file=new File(fileName);
	}
	public File getFile() {
		return file;
	}
}
