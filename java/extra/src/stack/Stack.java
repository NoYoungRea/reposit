package stack;

public class Stack {
	private int[]ary=null;
	private int top;
	
	public Stack(int index) {
		ary=new int[index];
		top=0;
	}
	public void push(int num) {
		if(top<=ary.length)
			ary[top++]=num;
		
	}
	public int pop() {
		return ary[--top];
	}
	public boolean isEmpty() {
		return top==0;
	}
	
}
