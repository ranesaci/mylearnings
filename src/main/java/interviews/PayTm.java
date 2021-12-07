package interviews;

/**
* @author sachin
* @date 02-Nov-2021
*/

//Java program to print smallest element
//in each level of binary tree.
import java.util.Arrays;
class PayTm
{
static int INT_MAX = (int) 10e6;

//A Binary Tree Node
static class Node
{
	int data;
	Node left, right;
};

//return height of tree
static int heightoftree(Node root)
{
	if (root == null)
		return 0;

	int left = heightoftree(root.left);
	int right = heightoftree(root.right);
	System.out.println("root.left:"+ root.left + " , root.right:"+ root.right);
	System.out.println("left:"+ left + " , right:"+right +  ", returned: "+((left > right ? left : right) + 1));
	return ((left > right ? left : right) + 1);
}

//Inorder Traversal
//Search minimum element in each level and
//store it into vector array.
static void printPerLevelMinimum(Node root,
					int []res, int level)
{
	if (root != null)
	{
		printPerLevelMinimum(root.left,
							res, level + 1);

		if (root.data < res[level])
			res[level] = root.data;

		printPerLevelMinimum(root.right,
							res, level + 1);
	}
}

static void perLevelMinimumUtility(Node root)
{
	
	// height of tree for the size of
	// vector array
	int n = heightoftree(root), i;

	// vector for store all minimum of
	// every level
	int []res = new int[n];
	Arrays.fill(res, INT_MAX);

	// save every level minimum using
	// inorder traversal
	printPerLevelMinimum(root, res, 0);

	// print every level minimum
	System.out.print("Every level minimum is\n");
	for (i = 0; i < n; i++)
	{
		System.out.print("level " + i +
						" min is = " +
						res[i] + "\n");
	}
}

//Utility function to create a new tree node
static Node newNode(int data)
{
	Node temp = new Node();
	temp.data = data;
	temp.left = temp.right = null;

	return temp;
}

//Driver Code
public static void main(String[] args)
{

	// Let us create binary tree shown
	// in above diagram
	Node root = newNode(7);
	root.left = newNode(6);
	root.right = newNode(5);
	root.left.left = newNode(4);
	root.left.right = newNode(3);
	root.right.left = newNode(2);
	root.right.right = newNode(1);

	/*	 7
		/ \
		6	 5
	/ \	 / \
	4 3 2 1		 */
	perLevelMinimumUtility(root);
}
}

//This code is contributed by PrinciRaj1992

