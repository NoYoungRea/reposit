package ingredientFactory;

import ingredient.ChedaCheese;
import ingredient.Cheese;
import ingredient.CheeseDough;
import ingredient.Dough;
import ingredient.SalsaSauce;
import ingredient.Sauce;
import pizza.PizzaHut;

public class PizzaHutIngredientFactory extends IngredientFactory{
	public static final String NAME="PizzaHutIngredientFactory";
	
	public PizzaHutIngredientFactory() {
		this.name=NAME;
		System.out.println(this);
	}
	
	public Dough createDough() {
		return new CheeseDough();
	}
	public Cheese createCheese() {
		return new ChedaCheese();
	}
	public Sauce createSauce() {
		return new SalsaSauce();
	}
	public String toString() {
		return NAME+" prepare ingredient for "+PizzaHut.NAME;
	}

}
