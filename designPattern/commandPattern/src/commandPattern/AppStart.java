package commandPattern;

public class AppStart {
	public static void main(String[]args) {
		TV tv=new TV();
		Cat cat=new Cat();
		Command tvOn=new TVOnCommand(tv);
		Command tvoff=new TVOffCommand(tv);
		Command catWakeUp=new CatWakeUpCommand(cat);
		Command catFeed=new CatFeedCommand(cat);

		
		RemoteController rc=new RemoteController();
		rc.setCommand(0, tvOn);
		rc.setCommand(1, tvoff);
		rc.pressButton(0);
		rc.pressButton(1);
		rc.pressButton(2);
		rc.setCommand(2, catWakeUp);
		rc.setCommand(3, catFeed);
		rc.pressButton(2);
		rc.pressButton(3);

		
	}
}
