class Person{
		String name="ȫ�浿";
		int gender;

public Person() {
		//System.out.println("����Ʈ �����ڰ� ȣ��Ǿ����ϴ�.");
		this("noname");
		//this("noname",20);
		System.out.println("person()���� ����");
	}
	public Person(String name) {
		this(name,10);
		System.out.println("Person(string)���� ����");
	}
	public Person(String name,int gender) {
		System.out.println("person(string,int)����");
		this.name=name;
		this.gender=gender;
	}

}
public class A7_thisTest {
	public static void main(String[]args) {
		Person p=new Person();
	}
}
