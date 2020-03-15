
public class A5_Array {
	public static void main(String[] args) {
		// 객체 변수 선언
		int a[];
		int[] b;

		int c[][];
		int[][] d;
		int[] e[];

		//변수에 인스턴스주소 집어넣기
		int[] f = { 1, 2, 3, 4, 5 };
		int[] g = new int[] { 1, 2, 3, 4, 5 };//두개 같은거
		int i[]=new int[5];// 힙에 인스턴스를 생성하면 초기화하지 않아도 자동으로 부의 값으로 저장된다.
		int[] h;
		// h= {1,2,3,4,5};
		h = new int[] { 1, 2, 3, 4, 5 };

		
		//
		int [][] a1=new int[][] {{1,2,3},{1,3},{3,4,5}};
		int [][] b2= new int[][] {{1,2,3},{5,6},{7,8,9}};//두개 같은거
		int [][] c2= new int[10][10];// 100개가 0으로 초기화
		int [][] c3=new int[10][]; //10개의 큰 테두리가 null로 초기화
		
		
		int [][] d2;
		d2=new int[3][]; //행의 수는 반드시 지정해 주어야 함. 열의 수는 얘가 상관할 부분이 아님
		d2[0]=new int[3];
		d2[1]=new int[2];
		d2[2]=new int[5];

		
		//이중 배열의 향상된 for문
		for(int[] tmp:d2) {
			for(int value:tmp) {
				System.out.println(value);
			}
		}

	}
}
