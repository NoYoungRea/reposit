public abstract class PizzaStore {

	protected String name;

	public PizzaStore(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Pizza order(String name);
}