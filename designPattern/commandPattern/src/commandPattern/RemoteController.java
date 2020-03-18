package commandPattern;

public class RemoteController {
	private Command[] coms;
	
	public RemoteController() {
		coms=new Command[4];
	}
	
	public void setCommand(int index,Command com) {
		try {
		coms[index]=com;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("it's not a button");
			System.err.println("press 0~"+(coms.length-1));
		}
	}
	public void pressButton(int index) {
		try {
		coms[index].excute();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("it's not a button");
			System.err.println("press 0~"+(coms.length-1));
		}
		catch(NullPointerException e){
			System.err.println("null");
			for(int i=0;i<coms.length;i++) {
				if(coms[i]==null) {
					System.err.println(i+":empty");
				}
				else {
					System.err.println(i+":"+coms[i].getClass().getName());
				}
			}
		}
	}
}
