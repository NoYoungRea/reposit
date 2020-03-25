package fileIOTest2;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class AppStart {
	public static void main(String[]args) {
	Queue<File> queue=new LinkedList<>();
	queue.add(new File("c:/3DP"));
	
	while(!queue.isEmpty()){
		File v=queue.poll();
		System.out.printf("%10s %s\n", (v.isDirectory() ? "Dir" : "File"), v.getParent());
		File[] list=v.listFiles();
		for(File u:list) {
			if(u.isDirectory()&&u.canRead()&&u.canWrite()) {
				queue.add(u);
			}
			else {
				System.out.printf("%10s %s\n", (u.isDirectory() ? "Dir" : "File"), u.getAbsolutePath());
			}
		}
	
	
	
	}
	}
}
