public class PizzaHut extends PizzaStore {
	public PizzaHut() {
		super("pizzaHut");

	}

	public Pizza order(String name) {
		return factory.createPizza(name);
	}
}