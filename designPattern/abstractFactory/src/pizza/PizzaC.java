package pizza;

import ingredient.Cheese;
import ingredient.Dough;
import ingredient.Sauce;

public class PizzaC extends Pizza{
	public final static String NAME="pizzaA";
	
	public PizzaC(Dough dough, Sauce sauce, Cheese cheese) {
		super(dough, sauce, cheese);
		name=NAME;
		System.out.println(this);
	}

}
