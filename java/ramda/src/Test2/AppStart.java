package Test2;
interface Fightable{
	void fight(String weaponName);
}
class Knight{
	void fight(Fightable f,String weapon) {
		f.fight(weapon);
	}
}
public class AppStart {

	public static void main(String[] args) {
		Knight k=new Knight();
		String weapon="soward";
		k.fight(weaponname-> {
			System.out.println("by "+weaponname);
		},weapon);
	}

}
