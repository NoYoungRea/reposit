
public class SingleTonPattern {
	
	private static SingleTonPattern single;
	
	static{
		single=new SingleTonPattern();
	}
	
	private SingleTonPattern() {
		
	}
	public static SingleTonPattern getInstance() {
		return single;
	}

}
