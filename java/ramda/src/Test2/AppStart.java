package Test2;
interface Fightable{
	void fight(String weaponName);
}
class Knight{
	void fight(Fightable f) {
		f.fight("swoard");
	}
}
public class AppStart {

	public static void main(String[] args) {
		Knight k=new Knight();
		k.fight((weapon)-> {
			System.out.println("by "+weapon);
		});
	}

}
