package interviews;

/**
* @author sachin
* @date 13-Sep-2021
*/

public class  BinaryTreeTraverseAsSpiral {

	   public static void main(String[] args) {
	     new BinaryTreeTraverseAsSpiral().run();
	   }
	 
	   static class Node {
	     Node left;
	     Node right;
	     int value;
	     Node next;  // to store child node reference at runtime
	     public Node(int value) {
	       this.value = value;
	     }
	   }

	   public void run() {
	     // build the simple tree
	     Node root = new Node(30);
	     insert(root, 20);
	     insert(root, 40);
	     insert(root, 15);
	     insert(root, 25);
	     insert(root, 35);
	     insert(root, 45);
	     insert(root, 7);
	     insert(root, 16);
	     insert(root, 22);
	     insert(root, 26);
	     insert(root, 33);
	     insert(root, 36);
	     insert(root, 43);
	     insert(root, 46);
	     TravesreTreeInSpiralOrder(root, true);
	   
	   }
	 
	   public void insert(Node node, int value) {
	     if (value < node.value) {
	       if (node.left != null) {
	         insert(node.left, value);
	       } else {
	         System.out.println("  Inserted " + value + " to left of "
	             + node.value);
	         node.left = new Node(value);
	       }
	     } else if (value > node.value) {
	       if (node.right != null) {
	         insert(node.right, value);
	       } else {
	         System.out.println("  Inserted " + value + " to right of "
	             + node.value);
	         node.right = new Node(value);
	       }
	     }
	   }

	 
	 public void TravesreTreeInSpiralOrder(Node root, boolean right) { 
	  Node row = null;   // storing horizontal node from right or left direction ie. storing child node reference at runtime
	  while (root != null) {
	   System.out.println(root.value);  // Value of the tree in spiral order
	   Node first = null;
	   Node second = null;
	   if (right == true) {
	    first = root.left;
	    second = root.right;
	   } else {
	    first = root.right;
	    second = root.left;
	   }
	   if(first!=null) {
	    row = addtoEndRow(row, first);
	   }
	   if(second!=null) {
	    row = addtoEndRow(row, second);
	   }
	   root = root.next;
	  }
	   right = !right;
	   if(row!=null)
	    TravesreTreeInSpiralOrder(row, right);

	 }
	 
	 public Node addtoEndRow(Node row,Node value) {
	  value.next = row;
	  return value;
	 }  

	}