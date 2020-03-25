package ioioio2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileObject {
	private File file;

	
	public FileObject(String fileName) {
		this.file = new File(fileName);
	}

	private ObjectInputStream getInputStream() throws Exception{
		return new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
	}

}
