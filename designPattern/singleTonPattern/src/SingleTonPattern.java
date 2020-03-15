
public class SingleTonPattern {
	private SingleTonPattern() {
		
	}
	public static SingleTonPattern getInstance() {
		return new SingleTonPattern();
	}

}
