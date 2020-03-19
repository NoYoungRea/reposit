package ingredientFactory;

import ingredient.Cheese;
import ingredient.CheeseDough;
import ingredient.Dough;
import ingredient.SalsaSauce;
import ingredient.Sauce;
import ingredient.mozaCheese;
import pizza.PizzaYou;

public class PizzaYouIngredientFactory extends IngredientFactory{
	public static final String NAME="PizzaYouIngredientFactory";
	
	public PizzaYouIngredientFactory() {
		this.name=NAME;
		System.out.println(this);
	}
	
	public Dough createDough() {
		return new CheeseDough();
	}
	public Cheese createCheese() {
		return new mozaCheese();
	}
	public Sauce createSauce() {
		return new SalsaSauce();
	}
	public String toString() {
		return NAME+" prepare ingredient for "+PizzaYou.NAME;
	}

}
