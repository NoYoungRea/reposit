package Test1;

interface Printable{
	void print(String name);
}
interface Calculator{
	int sum(int x,int y);
}
public class AppStart {

	public static void main(String[] args) {
	
		Runnable runnable =()->{
			//(¤·)
		};
		Printable printable=name->System.out.println("dtd");//when only one line
		
		Calculator calculator=(x,y)->return x+y;//(X) if there are a return you should input { }
		
	}
	

}
