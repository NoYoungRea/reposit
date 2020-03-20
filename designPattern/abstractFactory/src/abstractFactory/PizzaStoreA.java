package abstractFactory;

public class PizzaStoreA extends PizzaStore{
	public static String NAME="PizzaStore A";
	
	public PizzaStoreA() {
		name=NAME;
		System.out.println(this);
	}
}
