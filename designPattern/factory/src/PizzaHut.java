public class PizzaHut extends PizzaStore {
	public PizzaHut() {
		super("pizzaHut");

	}

	public Pizza order(String name) {
		Pizza pizza = null;
		if (name.equals(BaconPizza.NAME)) {
			pizza = new BaconPizza();
		} else if (name.equals(CheesePizza.NAME)) {
			pizza = new CheesePizza();
		} else {
			;
		}
		return pizza;
	}
}