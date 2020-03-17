public class AppStart {

	public static void main(String[] args) {
		PizzaStore store = new PizzaHut();
		store.setFactory(new PizzaHutFactory());
		Pizza baconPizza = store.order(BaconPizza.NAME);
		System.out.println(baconPizza.getDescript());

		Pizza cheesePizza = store.order(CheesePizza.NAME);
		System.out.println(cheesePizza.getDescript());
		
		store.setFactory(new NewPizzaHutFactory());
		Pizza unionPizza=store.order(UnionPizza.NAME);
		System.out.println(unionPizza.getDescript());

	}
}