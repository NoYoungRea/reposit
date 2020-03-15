package stack;

public class AppStart {
	public static void main(String[]args) {
		Stack stack =new Stack();
		for(int i=1;i<10;i++) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
