package stack;

public class Node {
	private Node next;
	private int data;
	
	public Node(Node next,int data){
		this.next=next;
		this.data=data;
	}
	public Node getNext() {
		return next;
	}
	public int getData() {
		return data;
	}

}
