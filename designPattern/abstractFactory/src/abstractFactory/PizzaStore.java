package abstractFactory;

import Factory.Factory;
import pizza.Pizza;

public abstract class PizzaStore {
	protected Factory factory;
	protected String name;

	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	public Pizza order(String pizza) {
		return factory.creatPizza(pizza);
	}
	public String toString() {
		return "hello Welcome to "+name;
	}
	
}
