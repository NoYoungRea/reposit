
public class DuckLikeTurkey extends Duck{
	private Turkey turkey;
	public DuckLikeTurkey() {
		turkey=new Turkey();
	}
	public void quack() {
		this.turkey.gobble();
	}
	
}
