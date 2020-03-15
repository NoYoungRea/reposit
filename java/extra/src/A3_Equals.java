
public class A3_Equals {
	public static void main(String[] args) {
		String n1=new String("shdudfo");
		String n2=new String("shdudfo");
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2)); //different objects but same value
		
		String n3="shdudfo";
		String n4="shdudfo";
		System.out.println(n3==n4);
		System.out.println(n3.equals(n4));
		
		Object o1=new Object();
		Object o2=new Object();
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2)); //equals is not a god
		
		Object o3=new Object();
		Object o4=o3;
		System.out.println(o3==o4);
		System.out.println(o3.equals(o4));
		
	}
}
