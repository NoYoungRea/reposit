
public class A5_Array {
	public static void main(String[] args) {
		// ��ü ���� ����
		int a[];
		int[] b;

		int c[][];
		int[][] d;
		int[] e[];

		//������ �ν��Ͻ��ּ� ����ֱ�
		int[] f = { 1, 2, 3, 4, 5 };
		int[] g = new int[] { 1, 2, 3, 4, 5 };//�ΰ� ������
		int i[]=new int[5];// ���� �ν��Ͻ��� �����ϸ� �ʱ�ȭ���� �ʾƵ� �ڵ����� ���� ������ ����ȴ�.
		int[] h;
		// h= {1,2,3,4,5};
		h = new int[] { 1, 2, 3, 4, 5 };

		
		//
		int [][] a1=new int[][] {{1,2,3},{1,3},{3,4,5}};
		int [][] b2= new int[][] {{1,2,3},{5,6},{7,8,9}};//�ΰ� ������
		int [][] c2= new int[10][10];// 100���� 0���� �ʱ�ȭ
		int [][] c3=new int[10][]; //10���� ū �׵θ��� null�� �ʱ�ȭ
		
		
		int [][] d2;
		d2=new int[3][]; //���� ���� �ݵ�� ������ �־�� ��. ���� ���� �갡 ����� �κ��� �ƴ�
		d2[0]=new int[3];
		d2[1]=new int[2];
		d2[2]=new int[5];

		
		//���� �迭�� ���� for��
		for(int[] tmp:d2) {
			for(int value:tmp) {
				System.out.println(value);
			}
		}

	}
}
