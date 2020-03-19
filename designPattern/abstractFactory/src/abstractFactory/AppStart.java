package abstractFactory;

import Factory.FactoryA;
import Factory.FactoryB;
import ingredientFactory.PizzaYouIngredientFactory;
import pizza.Pizza;
import pizza.PizzaHut;
import pizza.PizzaYou;

public class AppStart {
	public static void main(String []args) {
		
		
	PizzaStore store=new PizzaStoreA();
	
	store.setFactory(new FactoryB());
	store.order(PizzaHut.NAME);
	store.order(PizzaYou.NAME);
	
	store.setFactory(new FactoryA());
	store.order(PizzaYou.NAME);

	}
	
}
