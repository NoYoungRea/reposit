package commandPattern;

public class CatWakeUpCommand implements Command{
	private Cat cat;
	public CatWakeUpCommand(Cat cat) {
		this.cat=cat;
		}
	public void excute() {
		cat.wakeUp();
	}
}
