enum Week{
	MON,TUH,WED,THU,FRI,SAT,SUN
}


enum Country{
	KOREA("대한민국"),AMERICA("미국"),CANADA("캐나다"),ENGLAND("영국");
	private String name;
	private Country(String name) {
		this.name=name;

	}
	public String getName() {
		return name;
	}
}


public class A6_EnumTest {
	public static void main(String[]args) {
		Week today=Week.WED;
		Week nextDay=Week.valueOf("SAT");
		Week[] ws=Week.values();
		for(Week w:ws) {
			System.out.println(w);
			System.out.println(w.name());
			System.out.println(w.ordinal());
		}
		
		Country c=Country.KOREA;//여기에서 인스턴스 객체가 만들어짐 즉 생성자가 호출됨 그리고 name맴버에 대한민국 저장 new로 만드는 것이 아님
		System.out.println(c);//KOREA
		System.out.println(c.getName());//대한민국
		c=Country.AMERICA;//다시 인스턴스 만들어짐
		System.out.println(c);//AMERICA
		System.out.println(c.getName());//미국
	}

}
