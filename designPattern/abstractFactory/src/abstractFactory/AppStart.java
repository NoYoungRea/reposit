package abstractFactory;

public class AppStart {
	public static void main(String []args) {
	PizzaStore store=new PizzaStore();
	store.setFactory(new PizzaHutIngredientFactory());
	Pizza pizza= store.order();
	store.setFactory(new PizzaYouIngredientFactory());
	store.order();

	}
}
