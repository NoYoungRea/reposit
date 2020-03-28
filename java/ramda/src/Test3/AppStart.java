package Test3;

interface Calculator {
	int max(int a, int b);
}

class Computer {
	public int calc(Calculator calculator, int x, int y) {
		return calculator.max(x, y);
	}
}

public class AppStart {
	public static void main(String[] args) {
		Computer c = new Computer();
		int num=c.calc((a, b) -> {
			if (a > b)
				return a;
			else
				return b;
		}, 10, 20);
		
		System.out.println(num);
	}
}
