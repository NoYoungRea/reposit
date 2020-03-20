package Factory;

import pizza.Pizza;

public abstract class Factory {
	protected String name;
	public abstract Pizza creatPizza(String pizza);
	public abstract String toString();
}
