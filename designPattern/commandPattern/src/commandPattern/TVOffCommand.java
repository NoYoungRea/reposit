package commandPattern;

public class TVOffCommand implements Command{
	private TV tv;
	public TVOffCommand(TV tv) {
		this.tv=tv;
}
	public void excute() {
		tv.off();
	}
}
