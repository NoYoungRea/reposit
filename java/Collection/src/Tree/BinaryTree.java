package Tree;

public class BinaryTree {
	private Node root;
	
	public boolean add(int num) {
		return add(new Node(num,null,null));
	}
	public void searchNode(Node node) {
		if(node==null) {
			return;
		}
		else {
			searchNode(node.getLeft());
			System.out.print(node.getValue()+" ");
			searchNode(node.getRight());
		}
		
	}
	public void searchStart() {
		searchNode(root);
	}
	public boolean add(Node node) {
		if(root==null) {
			root=node;
			System.out.println("to root node");
			return true;
		}

		else {
			Node curNode=root;
			Node preNode=curNode;
			
			while(curNode!=null) {
				preNode=curNode;
				if(curNode.getValue()>node.getValue()) {
					curNode=curNode.getLeft();
				}
				else if(curNode.getValue()<node.getValue()){
					curNode=curNode.getRight();
				}
				else {
					System.out.println("to root node");
					return false;
				}
			}
			if(node.getValue()<preNode.getValue()) {
				System.out.println("left");

				preNode.setLeft(node);
			}
			else {
				System.out.println("right");
				preNode.setRight(node);
			}
			
		}
		return true;
	
	}

}
