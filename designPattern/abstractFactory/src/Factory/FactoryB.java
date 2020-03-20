package Factory;

import ingredientFactory.IngredientFactory;
import ingredientFactory.PizzaHutIngredientFactory;
import pizza.Pizza;
import pizza.PizzaHut;

public class FactoryB extends Factory{
	public static final String NAME="FactoryB";
	
	public FactoryB() {
		name=NAME;
		System.out.println(this);

	}
	
	public Pizza creatPizza(String pizza) {
		IngredientFactory infactory=null;
		Pizza piz=null;
		if(pizza==PizzaHut.NAME) {
			infactory=new PizzaHutIngredientFactory();
			piz= new PizzaHut(infactory.createDough(),infactory.createSauce(),infactory.createCheese());
			System.out.println(piz);

		}
		else
			System.out.println("there are no Pizza like that");
		return piz;
	}
	public String toString() {
		return "we deal with "+name+"(they make PizzaHut)";
	}
	
}
