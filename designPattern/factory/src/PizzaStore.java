public abstract class PizzaStore {

	protected String name;
	protected PizzaFactory factory;

	public PizzaStore(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PizzaFactory getFactory() {
		return factory;
	}

	public void setFactory(PizzaFactory factory) {
		this.factory = factory;
	}

	public abstract Pizza order(String name);
}