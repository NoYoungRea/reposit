package abstractFactory;

public class PizzaYouIngredientFactory extends IngredientFactory{
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
		return "PizzaYouIngredientFactory";
	}
}
