package interviews;

import java.util.Arrays;

public class TreeSort {

	public static void main(String[] args) {
		int[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
		System.out.println("Given Array" + Arrays.toString(intArr));
		MyTree myTree = new MyTree(intArr[0]);
		for (int i = 1; i < intArr.length; i++) {
			myTree.insert(myTree.node, intArr[i]);
		}
		
		System.out.println("Sorted Array:");
		myTree.inOrder(myTree.node);
		
		
	}
	
	

}

class Node {
	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		this.value = value;
	}
	
	
	public void data() {
		System.out.print(value+ " ");;
	}
}


class MyTree {
	
	Node node;
	
	public MyTree(int val) {
		node = new Node(val);
	}
	
	public Node insert(Node node, int val) {
		if (node == null) {
			return new Node(val);
		}
		if (val < node.value) {
			node.left = insert(node.left, val);
		} else {
			node.right = insert(node.right, val);
		}
		return node;
		
	}
	
	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			node.data();
			inOrder(node.right);
		}
		
	}
}
