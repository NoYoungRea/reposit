class Person{
		String name="홍길동";
		int gender;

public Person() {
		//System.out.println("디폴트 생성자가 호출되었습니다.");
		this("noname");
		//this("noname",20);
		System.out.println("person()으로 복귀");
	}
	public Person(String name) {
		this(name,10);
		System.out.println("Person(string)으로 복귀");
	}
	public Person(String name,int gender) {
		System.out.println("person(string,int)진입");
		this.name=name;
		this.gender=gender;
	}

}
public class A7_thisTest {
	public static void main(String[]args) {
		Person p=new Person();
	}
}
