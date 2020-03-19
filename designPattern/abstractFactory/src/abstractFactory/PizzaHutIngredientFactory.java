package abstractFactory;

public class PizzaHutIngredientFactory extends IngredientFactory{
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
		return "pizzaHutIngredientFactory";
	}
}
