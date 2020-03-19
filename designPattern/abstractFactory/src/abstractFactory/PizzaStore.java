package abstractFactory;

public class PizzaStore {
	private IngredientFactory factory;

	public void setFactory(IngredientFactory factory) {
		this.factory = factory;
	}
	public Pizza order() {
		Pizza pizza= new Pizza(factory.createDough(),factory.createSauce(),factory.createCheese());
		System.out.println("from : "+factory);
		System.out.println(pizza);
		return pizza;
	}
	
}
