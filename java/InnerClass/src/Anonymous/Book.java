package Anonymous;

public abstract class Book {
	protected String title;
	protected int price;
	
	public Book() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public abstract void showInfo();
}
