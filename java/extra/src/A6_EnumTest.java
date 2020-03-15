enum Week{
	MON,TUH,WED,THU,FRI,SAT,SUN
}


enum Country{
	KOREA("���ѹα�"),AMERICA("�̱�"),CANADA("ĳ����"),ENGLAND("����");
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
		
		Country c=Country.KOREA;//���⿡�� �ν��Ͻ� ��ü�� ������� �� �����ڰ� ȣ��� �׸��� name�ɹ��� ���ѹα� ���� new�� ����� ���� �ƴ�
		System.out.println(c);//KOREA
		System.out.println(c.getName());//���ѹα�
		c=Country.AMERICA;//�ٽ� �ν��Ͻ� �������
		System.out.println(c);//AMERICA
		System.out.println(c.getName());//�̱�
	}

}
