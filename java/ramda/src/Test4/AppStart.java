package Test4;


public class AppStart {
	public static void main(String[]args) {

		Box b = new Box(100,100);
		Box c= new Box(100,200);
		b.setComparator((B1,B2)->{
			int num=B1.getArea()-B2.getArea();
			if(num==0)
				num=B1.getWidth()-B2.getWidth();
			return num;

			
		});
		
		if(b.compareTo(c)>0) {
			System.out.println("b is bigger");
			
		}
		else
			System.out.println("c is bigger");

			
	}
}