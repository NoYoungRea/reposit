package pizza;

import ingredient.Cheese;
import ingredient.Dough;
import ingredient.Sauce;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	
	public Pizza(Dough dough,Sauce sauce,Cheese cheese) {
		this.dough=dough;
		this.sauce=sauce;
		this.cheese=cheese;

	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("name: "+name+"\n")
		.append("dough: "+dough+"\n")
		.append("sauce: "+sauce+"\n")
		.append("cheese: "+cheese);
		return sb.toString();
	}
}
