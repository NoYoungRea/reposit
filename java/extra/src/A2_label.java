
public class A2_label {
	public static void main(String[] args) {
		gugu: for (int i = 2; i < 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (i == 5 && j == 5)
					break gugu;
				System.out.println(i + "X" + j + "=" + (i * j));
			}
			
		}

	
	}
}
