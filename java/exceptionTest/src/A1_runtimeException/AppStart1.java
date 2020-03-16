package A1_runtimeException;

public class AppStart1 {
	public void a()throws NumberFormatException {
		b();
	}
	public void b()throws NumberFormatException {
		c();
	}
	public void c() throws NumberFormatException{
		String str="shdudfo";
		Double d=Double.parseDouble(str);
		System.out.println(d);
	}

	public static void main(String[] args)throws NumberFormatException {
		AppStart1 app=new AppStart1();
		app.a();

	}
}