package ingredientFactory;

import ingredient.Cheese;
import ingredient.Dough;
import ingredient.Sauce;
import pizza.PizzaHut;

public abstract class IngredientFactory {
	protected String name;
	
	public abstract Dough createDough();
	public abstract Cheese createCheese();
	public abstract Sauce createSauce();


}
