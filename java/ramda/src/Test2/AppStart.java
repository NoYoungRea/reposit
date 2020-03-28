package Test2;
interface Fightable{
	void fight();
}
class Knight{
	void fight(Fightable f) {
		f.fight();
	}
}
public class AppStart {

	public static void main(String[] args) {
		Knight k=new Knight();
		k.fight(()-> {
			System.out.println("by swoard");
		});
	}

}
