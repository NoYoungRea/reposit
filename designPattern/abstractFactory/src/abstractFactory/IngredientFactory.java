package abstractFactory;

public abstract class IngredientFactory {
	public abstract Dough createDough();
	public abstract Cheese createCheese();
	public abstract Sauce createSauce();
	public abstract String toString();

}
