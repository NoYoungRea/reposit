package Test2;
interface Fightable{
	void fight();
}
class Knight{
	void fight(Fightable f) {
		
	}
}
public class AppStart {

	public static void main(String[] args) {
		Knight k=new Knight();
		k.fight(new Fightable() {
			public void fight() {
				
			}
		});
	}

}
