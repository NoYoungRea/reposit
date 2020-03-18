
public class NewPizzaHutFactory extends PizzaFactory{
	public Pizza createPizza(String name) {
		switch(name) {
		case BaconPizza.NAME:return new BaconPizza();
		case CheesePizza.NAME:return new CheesePizza();
		case UnionPizza.NAME:return new UnionPizza();
		default:return null;
		}
	}
}