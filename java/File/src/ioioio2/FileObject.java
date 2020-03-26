package ioioio2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class FileObject {
	private File file;
	private ObjectInputStream in;
	private ObjectOutputStream out;
	private String fileName;

	public FileObject(String fileName) throws Exception {
		this.fileName = fileName;

	}

	public synchronized void saveObject(Object obj) throws Exception {
		if (in != null)
			in.close();

		if (out == null)
			this.out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(fileName))));

		// 입력 스트림닫음(조건:입력스트림이 생성된 경우)
		// 출력 스트림 취득(조건 : 출력스트림이 존재하지 않는 경우)

		out.writeObject(obj);
		out.flush();
	}

	public List<Object> getObject() throws Exception {
		LinkedList<Object> list = new LinkedList<>();
		// 출력스트림 닫음(소멸)
		// 입력스트림 취득(입력스트림이 존재하지 않을경우)

		synchronized (this) {
			if (out != null)
				out.close();

			if (in == null)
				this.in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(fileName))));

			while (true) {
				try {
					Object obj = in.readObject();
					list.add(obj);
				} catch (EOFException e) {
					break;
				}
				
			}

		}
		return list;
	}

	public synchronized void close() {
		try {
			in.close();

		} catch (Exception e) {
		}
		try {
			out.close();

		} catch (Exception e) {
		}

	}

}
