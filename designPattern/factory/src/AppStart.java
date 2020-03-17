public class AppStart {

	public static void main(String[] args) {
		PizzaStore store = new PizzaHut();
		Pizza baconPizza = store.order(BaconPizza.NAME);
		System.out.println(baconPizza.getDescript());

		Pizza cheesePizza = store.order(CheesePizza.NAME);
		System.out.println(cheesePizza.getDescript());

	}
}