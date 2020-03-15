class A3{
	int point;
}
public class A8_WrapperClass {
	public static void main(String[]args) {
		Integer i=1;
		i=2;
		
		String str=new String("abc");
		str="def";
		
		Integer[] i2= {1,2,4,13};
		for(int j=0;j<i2.length;j++) {
			i2[j]=i2[j]+10;
		}
		for(Integer value:i2) {
			System.out.println(value);
		}
		
		Integer[] i3= {1,2,3,4};
		for(Integer v:i3) {
			v+=10;
		}
		for(Integer value:i3) {
			System.out.println(value);
		}
	}

}
