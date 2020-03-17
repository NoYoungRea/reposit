
public class PizzaHutFactory extends PizzaFactory{

	public Pizza createPizza(String name) {
		switch(name) {
		case BaconPizza.NAME:return new BaconPizza();
		case CheesePizza.NAME:return new CheesePizza();
		default:return null;
		}
	}
}