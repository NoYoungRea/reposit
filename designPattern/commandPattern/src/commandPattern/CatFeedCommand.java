package commandPattern;

public class CatFeedCommand implements Command{
	private Cat cat;
	public CatFeedCommand(Cat cat) {
		this.cat=cat;
	}
	public void excute() {
		cat.feed();
	}
}
