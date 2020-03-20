package pizza;

import ingredient.Cheese;
import ingredient.Dough;
import ingredient.Sauce;

public class PizzaYou extends PizzaHut{
	public final static String NAME="pizzaYou";
	
	public PizzaYou(Dough dough, Sauce sauce, Cheese cheese) {
		super(dough, sauce, cheese);
		name=NAME;

	}

}
