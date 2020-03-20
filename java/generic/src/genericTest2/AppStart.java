package genericTest2;

class Box<T>{
	T member;
	
	public Box(T member) {
		this.member=member;
	}
	public void setMember(T member) {
		this.member=member;
	}
	public T getMember() {
		return member;
	}
}
public class AppStart {
	public static void main(String[]args) {
		Box box=new Box(new Integer(10));
		System.out.println(box.getMember());
	}
}
