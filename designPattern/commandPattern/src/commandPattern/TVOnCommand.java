package commandPattern;

public class TVOnCommand implements Command{
	private TV tv;
	public TVOnCommand(TV tv) {
		this.tv=tv;
		}
	public void excute() {
		tv.on();
	}
}
