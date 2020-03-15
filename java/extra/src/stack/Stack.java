package stack;

public class Stack {
	private Node head=null;

	
	public Stack() {

	}
	public void push(int num) {

		head=new Node(this.head,num);
	}
	public int pop() {
		int tmp=head.getData();
		this.head=head.getNext();
		return tmp;
	}
	public boolean isEmpty() {
		return (head==null);
	}
	
}
