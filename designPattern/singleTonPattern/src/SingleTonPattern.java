
public class SingleTonPattern {
	
	private static SingleTonPattern single;
	
	static{
		
	}
	
	private SingleTonPattern() {
		
	}
	public static SingleTonPattern getInstance() {
		if(single==null) {
			single=new SingleTonPattern();
		}
		return single;
	}

}
