package Anonymous;

public class AppStart {
	public static void main(String[] args) {
		Book book = new Book() {

			public void showInfo() {
				System.out.println(title + "," + price);
			}
		};
		book.setTitle("dkd");
		book.setPrice(3000);
		book.showInfo();

		Fightable fighter = new Fightable() {
			public void fight() {
				System.out.println("can do");
			}
		};

		fighter.fight();
	}
}
