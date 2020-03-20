package pizza;

import ingredient.Cheese;
import ingredient.Dough;
import ingredient.Sauce;

public class PizzaHut extends Pizza{
	public final static String NAME="pizzaHut";
	
	public PizzaHut(Dough dough, Sauce sauce, Cheese cheese) {
		super(dough, sauce, cheese);
		name=NAME;

	}


}
