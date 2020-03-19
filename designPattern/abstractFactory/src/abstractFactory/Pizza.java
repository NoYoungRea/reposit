package abstractFactory;

public class Pizza {
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	
	public Pizza(Dough dough,Sauce sauce,Cheese cheese) {
		this.dough=dough;
		this.sauce=sauce;
		this.cheese=cheese;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("ingredient\n")
		.append("dough: "+dough+"\n")
		.append("sauce: "+sauce+"\n")
		.append("cheese: "+cheese+"\n");
		return sb.toString();
	}
}
