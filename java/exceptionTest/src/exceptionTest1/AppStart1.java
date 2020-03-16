package exceptionTest1;

public class AppStart1 {
	public void a() {
		b();
	}
	public void b() {
		c();
	}
	public void c() {
		String str="shdudfo";
		Double d=Double.parseDouble(str);
		System.out.println(d);
	}

	public static void main(String[] args) {
		AppStart1 app=new AppStart1();
		app.a();
	}
}